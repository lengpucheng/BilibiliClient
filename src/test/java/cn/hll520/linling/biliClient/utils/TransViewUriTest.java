package cn.hll520.linling.biliClient.utils;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.BiliClientFactor;
import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import cn.hll520.linling.biliClient.model.dynamic.DynamicItems;
import cn.hll520.linling.biliClient.model.user.User;
import cn.hll520.linling.biliClient.model.video.Video;
import org.junit.Test;

/**
 * 描述： View转换工具
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-20-15:31
 * @since 2021-02-20-15:31
 */
public class TransViewUriTest {
    BiliClient biliClient = BiliClientFactor.getClient();

    @Test
    public void transUser() {
        User user = biliClient.user().withUID(5548903L).get();
        System.out.println(user);
        System.out.println(TransViewUri.trans(user));
    }

    @Test
    public void transDynamic() {
        Dynamic dynamic = biliClient.dynamic().withDynamicId(464864767376633630L).get();
        System.out.println(dynamic);
        System.out.println(TransViewUri.trans(dynamic));
        System.out.println("############");
        DynamicItems list = biliClient.dynamic().withHostUid(392819792L).list();
        list.getItems().stream().map(TransViewUri::trans).forEach(System.out::println);
    }

    @Test
    public void transVideo() {
        Video video = biliClient.video().withBvid("BV1nz4y1r7TW").get();
        System.out.println(video);
        System.out.println(TransViewUri.trans(video));
    }

    @Test
    public void BvidToAvid() {
        System.out.println(TransViewUri.BvidToAvid("BV1nz4y1r7TW"));
    }

    @Test
    public void avidToBvid() {
        System.out.println(TransViewUri.AvidToBvid(19890604L));
    }
}