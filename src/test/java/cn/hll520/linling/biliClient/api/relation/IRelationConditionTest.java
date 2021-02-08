package cn.hll520.linling.biliClient.api.relation;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.BiliClientFactor;
import cn.hll520.linling.biliClient.model.relation.Relation;
import org.junit.Test;

import java.util.Date;

/**
 * 描述：
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:59
 * @since 2021-02-08-16:59
 */
public class IRelationConditionTest {

    private final BiliClient biliClient = BiliClientFactor.getClient();

    @Test
    public void toFollowers() {
        Relation list = biliClient.relation().toFollowers(392819792L).list();
        System.out.println(list.getTotal());
        System.out.println(list.getItems().get(0).getUname());
    }

    @Test
    public void toFollowings() {
        Relation list = biliClient.relation().toFollowings(392819792L).listPage(25L, 2L);
        System.out.println(list.getTotal());
        System.out.println(list.getItems().size());
        System.out.println(list.getItems().get(0).getUname());
        System.out.println(new Date(list.getItems().get(0).getMtime()));

    }
}