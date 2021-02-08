package cn.hll520.linling.biliClient.api.relation;

import cn.hll520.linling.biliClient.BiliRequestFactor;
import cn.hll520.linling.biliClient.able.Listable;
import cn.hll520.linling.biliClient.model.relation.Relation;

/**
 * 描述： 关系条件
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:53
 * @since 2021-02-08-16:53
 */
public class RelationConditionImpl implements IRelationCondition {

    @Override
    public Listable<Relation> toFollowers(long uid) {
        return new RelationList(BiliRequestFactor.getBiliRequest().setPath(RelationPath.RELATION_FOLLOWERS)
                .setParams("vmid", uid));
    }

    @Override
    public Listable<Relation> toFollowings(long uid) {
        return new RelationList(BiliRequestFactor.getBiliRequest().setPath(RelationPath.RELATION_FOLLOWINGS)
                .setParams("vmid", uid));
    }
}
