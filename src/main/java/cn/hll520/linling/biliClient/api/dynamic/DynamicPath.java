package cn.hll520.linling.biliClient.api.dynamic;

/**
 * 描述： 动态 path
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-20:18
 * @since 2021-02-07-20:18
 */
public interface DynamicPath {
    /**
     * 动态详情  vc
     * <p>dynamic_id  --- 动态 id</p>
     */
    String DYNAMIC_DETAIL = "/dynamic_svr/v1/dynamic_svr/get_dynamic_detail";
    /**
     * 用户动态列表
     * <p>visitor_uid : 参观者id 未登录 默认0 非必须</p>
     * <p>host_uid : 用户uid 必选</p>
     * <p>offset_dynamic_id : 偏移量 第一次为0</p>
     * <p>platform : 平台 默认 web 非必须</p>
     */
    String DYNAMIC_USER_LIST = "/dynamic_svr/v1/dynamic_svr/space_history";
}
