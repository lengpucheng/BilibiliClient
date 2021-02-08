package cn.hll520.linling.biliClient.api.video;

import cn.hll520.linling.biliClient.BiliRequestFactor;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.model.video.Video;

/**
 * 描述：视频条件
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-19:11
 * @since 2021-02-08-19:11
 */
public class VideoConditionImpl implements IVideoCondition {
    @Override
    public Gettable<Video> withAvid(long av) {
        return new VideoGet(BiliRequestFactor.getBiliRequest().setPath(VideoPath.VIDEO_INFO).setParams("aid", av));
    }

    @Override
    public Gettable<Video> withBvid(String bvid) {
        return new VideoGet(BiliRequestFactor.getBiliRequest().setPath(VideoPath.VIDEO_INFO).setParams("bvid", bvid));

    }
}
