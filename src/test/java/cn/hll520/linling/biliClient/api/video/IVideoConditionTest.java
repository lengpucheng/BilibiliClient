package cn.hll520.linling.biliClient.api.video;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.BiliClientFactor;
import cn.hll520.linling.biliClient.model.video.Video;
import org.junit.Test;

/**
 * 描述：
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-19:13
 * @since 2021-02-08-19:13
 */
public class IVideoConditionTest {
    private final BiliClient biliClient = BiliClientFactor.getClient();

    @Test
    public void withAvid() {
        Video video = biliClient.video().withAvid(12306L).get();
        System.out.println(video);
    }

    @Test
    public void withBvid() {
        Video video = biliClient.video().withBvid("BV1Zx411A7Q9").get();
        System.out.println(video);

    }
}