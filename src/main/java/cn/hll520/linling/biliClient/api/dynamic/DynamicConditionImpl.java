package cn.hll520.linling.biliClient.api.dynamic;

import cn.hll520.linling.biliClient.BiliRequestFactor;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.able.Listable;
import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import cn.hll520.linling.biliClient.model.dynamic.DynamicItems;

/**
 * 描述：动态条件实现类
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-21:24
 * @since 2021-02-07-21:24
 */
public class DynamicConditionImpl implements IDynamicCondition {
    @Override
    public Gettable<Dynamic> withDynamicId(Long dynamicId) {
        return new DynamicGet(BiliRequestFactor.getBiliRequest().useHostVC().setPath(DynamicPath.DYNAMIC_DETAIL)
                .setParams("dynamic_id", dynamicId));
    }

    @Override
    public Listable<DynamicItems> withHostUid(Long uid) {
        return new DynamicList(BiliRequestFactor.getBiliRequest().useHostVC().setPath(DynamicPath.DYNAMIC_USER_LIST)
                .setParams("host_uid", uid));
    }
}
