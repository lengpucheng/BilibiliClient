package cn.hll520.linling.biliClient.api.relation;

import cn.hll520.linling.biliClient.BiliCondition;
import cn.hll520.linling.biliClient.able.Listable;
import cn.hll520.linling.biliClient.model.relation.Relation;

/**
 * 描述：
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:29
 * @since 2021-02-08-16:29
 */
public interface IRelationCondition extends BiliCondition {
    /**
     * 粉丝
     *
     * @param uid uid
     * @return relation
     */
    Listable<Relation> toFollowers(long uid);

    /**
     * 关注
     *
     * @param uid uid
     * @return relation
     */
    Listable<Relation> toFollowings(long uid);
}
