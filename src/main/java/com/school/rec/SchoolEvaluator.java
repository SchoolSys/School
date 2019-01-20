package com.school.rec;

import com.school.utils.StringUtils;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
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
 * 推荐系统
 * @author Bufrosa
 * @version 1.0.0
 * @date 2019-01-20 19:56
 */
public final class SchoolEvaluator {

    /**
     * 邻居个数
     */
    static int NEIGHBORHOOD_NUM = 5;

    /**
     * 推荐个数
     */
    static int RECOMMENDER_NUM = 5;

    /**
     * 给指定用户推荐物品。建议在进行正式推荐之前，先通过evalute函数评估算法性能，选出较好的推荐算法（默认使用基于NEAREST的PEARSON相似度算法）。
     * @param file 数据集文件地址
     * @param neighborNum 临近算法邻居个数
     * @param recNum 推荐个数
     * @param similarity 相似度算法
     * @param userId 指定用户
     * @return
     */
    public static List<RecommendedItem> rec(String file, int neighborNum, int recNum, int userId) throws TasteException, IOException{
        return rec(file, neighborNum, recNum, RecommendFactory.SIMILARITY.PEARSON, userId);
    }

    public static List<RecommendedItem> rec(String file, int userId) throws TasteException, IOException{
        return rec(file, 5, 5, userId);
    }

    public static List<RecommendedItem> rec(String file, int neighborNum, int recNum, RecommendFactory.SIMILARITY similarity,
                                            int userId) throws TasteException, IOException{
        NEIGHBORHOOD_NUM = neighborNum;
        RECOMMENDER_NUM = recNum;
        DataModel model = RecommendFactory.buildDataModel(file);
        UserSimilarity userSimilarity = RecommendFactory.userSimilarity(similarity, model);
        UserNeighborhood userNeighborhood = RecommendFactory.userNeighborhood(RecommendFactory.NEIGHBORHOOD.NEAREST,
                userSimilarity, model, NEIGHBORHOOD_NUM);
        Recommender rec = new GenericUserBasedRecommender(model, userNeighborhood, userSimilarity);
        return rec.recommend(userId, RECOMMENDER_NUM);
    }

    /**
     * 评估算法
     * @param file
     * @throws TasteException
     * @throws IOException
     */
    public static void evalute(String file) throws TasteException, IOException {
        if (StringUtils.isBlank(file)){
            file = "mahout/rating.txt";
        }
        DataModel model = new FileDataModel(new File(ClassLoader.getSystemResource(file).getFile()));

        // 测试算法
        userEuclidean(model);
        userLoglikelihood(model);
        userEuclideanNoPref(model);

        itemEuclideanNoPref(model);
        itemLoglikelihood(model);
        itemEuclidean(model);
    }

    /**
     * 用户啥算法
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder userEuclidean(DataModel dataModel) throws TasteException, IOException {
        System.out.println("userEuclidean");
        UserSimilarity userSimilarity = RecommendFactory.userSimilarity(RecommendFactory.SIMILARITY.EUCLIDEAN, dataModel);
        UserNeighborhood userNeighborhood = RecommendFactory.userNeighborhood(RecommendFactory.NEIGHBORHOOD.NEAREST, userSimilarity, dataModel, NEIGHBORHOOD_NUM);
        RecommenderBuilder recommenderBuilder = RecommendFactory.userRecommender(userSimilarity, userNeighborhood, true);

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, recommenderBuilder, null, dataModel, 0.7);
        RecommendFactory.statsEvaluator(recommenderBuilder, null, dataModel, 2);
        return recommenderBuilder;
    }

    /**
     * 有pref的用户啥算法
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder userLoglikelihood(DataModel dataModel) throws TasteException, IOException {
        System.out.println("userLoglikelihood");
        UserSimilarity userSimilarity = RecommendFactory.userSimilarity(RecommendFactory.SIMILARITY.LOGLIKELIHOOD, dataModel);
        UserNeighborhood userNeighborhood = RecommendFactory.userNeighborhood(RecommendFactory.NEIGHBORHOOD.NEAREST, userSimilarity, dataModel, NEIGHBORHOOD_NUM);
        RecommenderBuilder recommenderBuilder = RecommendFactory.userRecommender(userSimilarity, userNeighborhood, true);

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, recommenderBuilder, null, dataModel, 0.7);
        RecommendFactory.statsEvaluator(recommenderBuilder, null, dataModel, 2);
        return recommenderBuilder;
    }

    /**
     * no pref的用户啥算法
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder userEuclideanNoPref(DataModel dataModel) throws TasteException, IOException{
        System.out.println("userEuclideanNoPref");
        UserSimilarity userSimilarity = RecommendFactory.userSimilarity(RecommendFactory.SIMILARITY.EUCLIDEAN, dataModel);
        UserNeighborhood userNeighborhood = RecommendFactory.userNeighborhood(RecommendFactory.NEIGHBORHOOD.NEAREST, userSimilarity, dataModel, NEIGHBORHOOD_NUM);
        RecommenderBuilder recommenderBuilder = RecommendFactory.userRecommender(userSimilarity, userNeighborhood, false);

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, recommenderBuilder, null, dataModel, 0.7);
        RecommendFactory.statsEvaluator(recommenderBuilder, null, dataModel, 2);
        return recommenderBuilder;
    }

    /**
     * TODO 啥玩意
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder itemLoglikelihood(DataModel dataModel) throws TasteException, IOException{
        System.out.println("itemLoglikelihood");
        ItemSimilarity similarity = RecommendFactory.itemSimilarity(RecommendFactory.SIMILARITY.LOGLIKELIHOOD, dataModel);
        RecommenderBuilder builder = RecommendFactory.itemRecommender(similarity, true);;

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, builder, null, dataModel, 0.7);
        RecommendFactory.statsEvaluator(builder, null, dataModel, 2);
        return builder;
    }

    /**
     * itemEuclidean
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder itemEuclidean(DataModel dataModel) throws TasteException, IOException {
        System.out.println("itemEuclidean");
        ItemSimilarity itemSimilarity = RecommendFactory.itemSimilarity(RecommendFactory.SIMILARITY.EUCLIDEAN, dataModel);
        RecommenderBuilder recommenderBuilder = RecommendFactory.itemRecommender(itemSimilarity, true);

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, recommenderBuilder, null, dataModel, 0.7);
        RecommendFactory.statsEvaluator(recommenderBuilder, null, dataModel, 2);
        return recommenderBuilder;
    }

    /**
     * no pref的基于item的算法
     * @param dataModel
     * @return
     * @throws TasteException
     * @throws IOException
     */
    private static RecommenderBuilder itemEuclideanNoPref(DataModel dataModel) throws TasteException, IOException {
        System.out.println("itemEuclideanNoPref");
        ItemSimilarity similarity = RecommendFactory.itemSimilarity(RecommendFactory.SIMILARITY.EUCLIDEAN, dataModel);
        RecommenderBuilder builder = RecommendFactory.itemRecommender(similarity, false);

        RecommendFactory.evaluate(RecommendFactory.EVALUATOR.AVERAGE_ABSOLUTE_DIFFERENCE, builder, null, dataModel,
                0.7);
        RecommendFactory.statsEvaluator(builder, null, dataModel, 2);
        return builder;
    }
}
