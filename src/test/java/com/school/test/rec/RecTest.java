package com.school.test.rec;

import com.school.rec.RecommendFactory;
import com.school.rec.SchoolEvaluator;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.junit.Test;

import java.util.List;

/**
 * 推荐系统测试
 * @author Bufrosa
 * @version 1.0.0
 * @date 2019-01-18 21:14
 */
public class RecTest {

    @Test
    public void evaluate() throws Exception{
        SchoolEvaluator.evalute(null);
    }

    @Test
    public void rec() throws Exception{
        String file = ClassLoader.getSystemResource("mahout/rating.txt").getFile();
        List<RecommendedItem> items = SchoolEvaluator.rec(file, 5, 5, RecommendFactory.SIMILARITY.PEARSON, 1);
        // RecommendedItem[item:533, value:10.0]
        for (RecommendedItem item : items){
            System.out.println(item);
        }
    }
}
