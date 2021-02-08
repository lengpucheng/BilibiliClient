package cn.hll520.linling.biliClient.api.relation;

import cn.hll520.linling.biliClient.BiliCall;
import cn.hll520.linling.biliClient.BiliRequest;
import cn.hll520.linling.biliClient.able.Listable;
import cn.hll520.linling.biliClient.model.relation.Relation;

/**
 * 描述： 关系
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:32
 * @since 2021-02-08-16:32
 */
public class RelationList implements Listable<Relation> {

    private final BiliRequest result;

    public RelationList(BiliRequest result) {
        this.result = result;
    }

    @Override
    public Relation list() {
        return Relation.build(BiliCall.doCall(result));
    }

    @Override
    public Relation list(Long limit, Long offset) {
        return Relation.build(BiliCall.doCall(result.setParams("pn", offset / limit).setParams("ps", limit)));
    }

    @Override
    public Relation list(Long nextOffset) {
        return Relation.build(BiliCall.doCall(result.setParams("pn", nextOffset)));
    }

    @Override
    public Relation listPage(Long size, Long page) {
        return Relation.build(BiliCall.doCall(result.setParams("pn", page).setParams("ps", size)));
    }
}
