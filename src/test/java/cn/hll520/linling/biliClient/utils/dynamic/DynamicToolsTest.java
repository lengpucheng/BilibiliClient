package cn.hll520.linling.biliClient.utils.dynamic;

import cn.hll520.linling.biliClient.BiliClientFactor;
import org.junit.Test;

/**
 * 描述： 分析工具测试
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-15:36
 * @since 2021-02-08-15:36
 */
public class DynamicToolsTest {


    @Test
    public void queryData() {
        DynamicSortInfo dynamicSortInfo = DynamicTools.queryData(BiliClientFactor.getClient(), 5548903L);
//        System.out.println(dynamicSortInfo);


        System.out.println("______________________");
        System.out.println("总动态" + dynamicSortInfo.getCount());
        System.out.println("总阅读" + dynamicSortInfo.getViewAll());
        System.out.println("总点赞" + dynamicSortInfo.getLikeAll());
        System.out.println("总转发" + dynamicSortInfo.getRepostAll());
        System.out.println("总评论" + dynamicSortInfo.getCommentAll());
        System.out.println("总硬币" + dynamicSortInfo.getCoinAll());

        System.out.println("________________分类______________");
        dynamicSortInfo.getSortInfo().forEach((type, dynamicInfo) -> {
            System.out.println("________________" + type + "______________");
            System.out.println(type + "总动态" + dynamicInfo.getCount());
            System.out.println(type + "总阅读" + dynamicInfo.getViewAll());
            System.out.println(type + "总点赞" + dynamicInfo.getLikeAll());
            System.out.println(type + "总转发" + dynamicInfo.getRepostAll());
            System.out.println(type + "总评论" + dynamicInfo.getCommentAll());
            System.out.println(type + "总硬币" + dynamicInfo.getCoinAll());
        });

    }
}