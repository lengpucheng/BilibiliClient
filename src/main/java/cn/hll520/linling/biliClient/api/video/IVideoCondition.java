package cn.hll520.linling.biliClient.api.video;

import cn.hll520.linling.biliClient.BiliCondition;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.model.video.Video;

/**
 * 描述：视频条件
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-19:07
 * @since 2021-02-08-19:07
 */
public interface IVideoCondition extends BiliCondition {
    /**
     * 根据av 查
     *
     * @param av av
     * @return get
     */
    Gettable<Video> withAvid(long av);

    /**
     * 根据bvid 查
     *
     * @param bvid bv
     * @return get
     */
    Gettable<Video> withBvid(String bvid);
}
