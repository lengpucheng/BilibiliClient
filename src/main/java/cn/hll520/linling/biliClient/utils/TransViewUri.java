package cn.hll520.linling.biliClient.utils;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.BiliClientFactor;
import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import cn.hll520.linling.biliClient.model.user.User;
import cn.hll520.linling.biliClient.model.video.Video;
import lombok.extern.slf4j.Slf4j;

/**
 * 描述：将对象转换为真实的访问地址
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-20-15:27
 * @since 2021-02-20-15:27
 */
@Slf4j
public class TransViewUri {
    /**
     * 用户
     *
     * @param user 用户
     * @return 用户主页
     */
    public static String trans(User user) {
        return "https://space.bilibili.com/" + user.getMid();
    }

    /**
     * 动态
     *
     * @param dynamic 动态
     * @return 动态详情
     */
    public static String trans(Dynamic dynamic) {
        if (dynamic != null && dynamic.getData() != null)
            return "https://t.bilibili.com/" + dynamic.getData().getDynamic_id();
        else
            return null;
    }

    /**
     * 视频
     *
     * @param video 视频
     * @return 视频地址
     */
    public static String trans(Video video) {
        if (video != null) {
            if (!video.getBvid().isEmpty()) {
                return "https://www.bilibili.com/video/" + video.getBvid();
            } else if (video.getAid() != 0) {
                return "https://www.bilibili.com/video/av" + video.getAid();
            }
        }
        return null;
    }

    /**
     * Av转Bv
     *
     * @param avid av
     * @return bv
     */
    public static String AvidToBvid(long avid) {
        Video video = null;
        try {
            BiliClient biliClient = BiliClientFactor.getClient();
            video = biliClient.video().withAvid(avid).get();
            if (video != null)
                return video.getBvid();
        } catch (Exception e) {
            log.error("转换错误，原始id为 {},对于视频信息为{},错误原因为{}", avid, video, e);
            e.printStackTrace();
        }
        return null;
    }


    /**
     * bv转av
     *
     * @param bvid bv
     * @return av
     */
    public static long BvidToAvid(String bvid) {
        Video video = null;
        try {
            BiliClient biliClient = BiliClientFactor.getClient();
            video = biliClient.video().withBvid(bvid).get();
            if (video != null)
                return video.getAid();
        } catch (Exception e) {
            log.error("转换错误，原始id为 {},对于视频信息为{},错误原因为{}", bvid, video, e);
            e.printStackTrace();
        }
        return 0;
    }
}
