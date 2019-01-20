package com.school.rec;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.DataModelBuilder;
import org.apache.mahout.cf.taste.eval.IRStatistics;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.eval.RecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.GenericRecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.impl.eval.RMSRecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.model.GenericBooleanPrefDataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericBooleanPrefItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericBooleanPrefUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.svd.Factorizer;
import org.apache.mahout.cf.taste.impl.recommender.svd.SVDRecommender;
import org.apache.mahout.cf.taste.impl.similarity.CityBlockSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.SpearmanCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.UncenteredCosineSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 工厂化生产推荐系统所需数据
 * @author Bufrosa
 * @version 1.0.0
 * @date 2019-01-20 19:48
 */
public final class RecommendFactory {

    /**
     * 相似度
     */
    public enum SIMILARITY {
        /**
         * 相似度
         */
        PEARSON, EUCLIDEAN, COSINE, TANIMOTO, LOGLIKELIHOOD, SPEARMAN, CITYBLOCK, FARTHEST_NEIGHBOR_CLUSTER, NEAREST_NEIGHBOR_CLUSTER
    }

    /**
     * 近邻算法
     */
    public enum NEIGHBORHOOD {
        /**
         * 近邻算法
         */
        NEAREST, THRESHOLD
    }

    /**
     * 基于什么的推荐机制
     */
    public enum RECOMMENDER {
        /**
         * 基于什么的推荐机制
         */
        USER, ITEM
    }

    /**
     * 评测算法
     */
    public enum EVALUATOR {
        /**
         * 评测算法
         */
        AVERAGE_ABSOLUTE_DIFFERENCE, RMS
    }

    /**
     * 获取数据集
     * @param file
     * @return
     * @throws IOException
     */
    public static DataModel buildDataModel(String file) throws IOException {
        return new FileDataModel(new File(file));
    }

    /**
     * @param file
     * @return
     * @throws TasteException
     * @throws IOException
     */
    public static DataModel buildDataModelNoPref(String file) throws TasteException, IOException{
        return new GenericBooleanPrefDataModel(GenericBooleanPrefDataModel.toDataMap(new FileDataModel(new File(file))));
    }

    /**
     * 获取数据集的创建器
     * @return
     */
    public static DataModelBuilder buildDataModelNoPrefBuilder(){
        return (trainingData)->
            new GenericBooleanPrefDataModel(GenericBooleanPrefDataModel.toDataMap(trainingData));
    }

    /**
     * 动态获取指定的用户相似度算法
     * @param type
     * @param m
     * @return
     * @throws TasteException
     */
    public static UserSimilarity userSimilarity(SIMILARITY type, DataModel m) throws TasteException{
        switch (type){
            case PEARSON:
                return new PearsonCorrelationSimilarity(m);
            case COSINE:
                return new UncenteredCosineSimilarity(m);
            case TANIMOTO:
                return new TanimotoCoefficientSimilarity(m);
            case LOGLIKELIHOOD:
                return new LogLikelihoodSimilarity(m);
            case SPEARMAN:
                return new SpearmanCorrelationSimilarity(m);
            case CITYBLOCK:
                return new CityBlockSimilarity(m);
            case EUCLIDEAN:
            default:
                return new EuclideanDistanceSimilarity(m);
        }
    }

    /**
     * 基于item的相似度
     * @param type
     * @param m
     * @return
     * @throws TasteException
     */
    public static ItemSimilarity itemSimilarity(SIMILARITY type, DataModel m) throws TasteException {
        switch (type) {
            case PEARSON:
                return new PearsonCorrelationSimilarity(m);
            case COSINE:
                return new UncenteredCosineSimilarity(m);
            case TANIMOTO:
                return new TanimotoCoefficientSimilarity(m);
            case LOGLIKELIHOOD:
                return new LogLikelihoodSimilarity(m);
            case CITYBLOCK:
                return new CityBlockSimilarity(m);
            case EUCLIDEAN:
            default:
                return new EuclideanDistanceSimilarity(m);
        }
    }

    /**
     * 近邻算法
     * @param type
     * @param similarity
     * @param m
     * @param num
     * @return
     * @throws TasteException
     */
    public static UserNeighborhood userNeighborhood(NEIGHBORHOOD type, UserSimilarity similarity, DataModel m, double num)
            throws
            TasteException{
        switch (type){
            case NEAREST:
                return new NearestNUserNeighborhood((int)num, similarity, m);
            case THRESHOLD:
            default:
                return new ThresholdUserNeighborhood(num, similarity, m);
        }
    }

    /**
     * 基于用户的推荐器
     * @param us
     * @param un
     * @param pref
     * @return
     * @throws TasteException
     */
    public static RecommenderBuilder userRecommender(final UserSimilarity similarity, final UserNeighborhood neighborhood,
                                                     boolean pref)
            throws TasteException {
        return pref ? new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel dataModel) throws TasteException {
                return new GenericUserBasedRecommender(dataModel, neighborhood, similarity);
            }
        } : new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel dataModel) throws TasteException {
                return new GenericBooleanPrefUserBasedRecommender(dataModel, neighborhood, similarity);
            }
        };
    }

    /**
     * 基于物品的推荐器
     * @param is
     * @param pref
     * @return
     * @throws TasteException
     */
    public static RecommenderBuilder itemRecommender(final ItemSimilarity similarity, boolean pref) throws TasteException{
        return pref ? new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel dataModel) throws TasteException {
                return new GenericItemBasedRecommender(dataModel, similarity);
            }
        } : new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel dataModel) throws TasteException {
                return new GenericBooleanPrefItemBasedRecommender(dataModel, similarity);
            }
        } ;
    }

    /**
     * 基于SVD的推荐器
     * @param factorizer
     * @return
     * @throws TasteException
     */
    public static RecommenderBuilder  svdRecommender(final Factorizer factorizer) throws TasteException {
        return new RecommenderBuilder() {
            @Override
            public Recommender buildRecommender(DataModel dataModel) throws TasteException {
                return new SVDRecommender(dataModel, factorizer);
            }
        };
    }

    /**
     * 显示推荐结果
     * @param uid userId
     * @param recommendations 推荐商品
     * @param skip 是否不显示
     */
    public static void showItems(long uid, List<RecommendedItem> recommendations, boolean skip) {
        if (!skip || recommendations.size() > 0){
            System.out.printf("uid:%s,", uid);
            for (RecommendedItem item : recommendations){
                System.out.printf("(%s,%f)", item.getItemID(), item.getValue());
            }
            System.out.println();
        }
    }

    /**
     * 评测器生成
     * @param type
     * @return
     */
    public static RecommenderEvaluator buildEvaluator(EVALUATOR type) {
        switch (type) {
            case RMS:
                return new RMSRecommenderEvaluator();
            case AVERAGE_ABSOLUTE_DIFFERENCE:
            default:
                return new AverageAbsoluteDifferenceRecommenderEvaluator();
        }
    }

    /**
     * 评测
     * @param type
     * @param rb
     * @param mb
     * @param dm
     * @param trainPt
     * @throws TasteException
     */
    public static void evaluate(EVALUATOR type, RecommenderBuilder rb, DataModelBuilder mb, DataModel dm, double trainPt) throws TasteException {
        System.out.printf("%s Evaluater Score:%s\n", type.toString(), buildEvaluator(type).evaluate(rb, mb, dm, trainPt, 1.0));
    }

    /**
     * 评测
     * @param re
     * @param rb
     * @param mb
     * @param dm
     * @param trainPt
     * @throws TasteException
     */
    public static void evaluate(RecommenderEvaluator re, RecommenderBuilder rb, DataModelBuilder mb, DataModel dm, double trainPt) throws TasteException {
        System.out.printf("Evaluater Score:%s\n", re.evaluate(rb, mb, dm, trainPt, 1.0));
    }

    /**
     * stats评测
     * @param rb
     * @param mb
     * @param m
     * @param topn
     * @throws TasteException
     */
    public static void statsEvaluator(RecommenderBuilder rb, DataModelBuilder mb, DataModel m, int topn) throws
            TasteException {
        RecommenderIRStatsEvaluator evaluator = new GenericRecommenderIRStatsEvaluator();
        IRStatistics stats = evaluator.evaluate(rb, mb, m, null, topn, GenericRecommenderIRStatsEvaluator.CHOOSE_THRESHOLD, 1.0);
        System.out.printf("Recommender IR Evaluator: [Precision:%s,Recall:%s]\n", stats.getPrecision(), stats.getRecall());
    }
}
