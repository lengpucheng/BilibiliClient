package cn.hll520.linling.biliClient.model.dynamic;

import cn.hll520.linling.biliClient.model.video.Video;
import lombok.Data;

/**
 * 描述： 动态对象
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-20:54
 * @since 2021-02-07-20:54
 */
@Data
public class Dynamic {
    /**
     * 作者ID
     */
    private Long uid;
    /**
     * 作者姓名
     */
    private String name;
    /**
     * 是否转发
     */
    private DType type;

    /**
     * 源ID
     * <b>仅当是转发时存在</b>
     */
    private Long origId;

    /**
     * 数据
     */
    private DynamicData data;

    /**
     * 动态详情
     * <p>转发时为源 <b>若源违规被和谐将为null</b></p>
     */
    private DynamicDetail detail;


    /**
     * 转发内容 否则为null
     */
    private DynamicRepost repost;

    /**
     * 当DType 为 video 时
     */
    private Video video;

    /**
     * 动态类型枚举
     */
    public enum DType {
        /**
         * 普通动态
         */
        COMMON,
        /**
         * 转发动态
         */
        REPOST,
        /**
         * 视频动态
         */
        VIDEO,
        /**
         * 音频动态
         */
        AUDIO,
        /**
         * 专栏文章
         */
        ESSAY,
        /**
         * 直播动态
         */
        LIVE
    }
}
