package cn.hll520.linling.biliClient;

import cn.hll520.linling.biliClient.api.dynamic.DynamicConditionImpl;
import cn.hll520.linling.biliClient.api.dynamic.IDynamicCondition;
import cn.hll520.linling.biliClient.api.relation.IRelationCondition;
import cn.hll520.linling.biliClient.api.relation.RelationConditionImpl;
import cn.hll520.linling.biliClient.api.user.IUserCondition;
import cn.hll520.linling.biliClient.api.user.UserConditionImpl;
import cn.hll520.linling.biliClient.api.video.IVideoCondition;
import cn.hll520.linling.biliClient.api.video.VideoConditionImpl;

/**
 * 描述： 客户端工厂方法
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-16:00
 * @since 2021-02-07-16:00
 */
public class BiliClientFactor {
    public static BiliClient getClient() {
        return new BiliClientDefault();
    }


    private static class BiliClientDefault implements BiliClient {

        @Override
        public IUserCondition user() {
            return new UserConditionImpl();
        }

        @Override
        public IDynamicCondition dynamic() {
            return new DynamicConditionImpl();
        }

        @Override
        public IRelationCondition relation() {
            return new RelationConditionImpl();
        }

        @Override
        public IVideoCondition video() {
            return new VideoConditionImpl();
        }
    }
}
