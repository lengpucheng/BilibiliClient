package cn.hll520.linling.biliClient.utils.dynamic;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import cn.hll520.linling.biliClient.model.dynamic.DynamicItems;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述： 动态相关工具类
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-15:05
 * @since 2021-02-08-15:05
 */
public class DynamicTools {
    /**
     * 获取某一用户全部的动态信息
     *
     * @param biliClient biliClient
     * @param uid        uid
     * @return all dynamic
     */
    public static List<Dynamic> queryAll(BiliClient biliClient, Long uid) {
        List<Dynamic> dynamics = new ArrayList<>();
        DynamicItems items = biliClient.dynamic().withHostUid(uid).list(0L);
        do {
            dynamics.addAll(items.getItems());
            items = biliClient.dynamic().withHostUid(uid).list(items.getNextOffset());
        } while (items != null && items.getHasMore() == 1);
        return dynamics;
    }


    /**
     * 分析后的数据返回
     *
     * @param biliClient biliClient
     * @param uid        uid
     * @return all dynamic
     */
    public static DynamicSortInfo queryData(BiliClient biliClient, Long uid) {
        return (DynamicSortInfo) new DynamicSortInfo(queryAll(biliClient, uid)).analyze();
    }


}
