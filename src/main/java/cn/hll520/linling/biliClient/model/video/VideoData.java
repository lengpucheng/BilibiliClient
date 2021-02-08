package cn.hll520.linling.biliClient.model.video;

import lombok.Data;

/**
 * 描述： 视频数据
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-18:50
 * @since 2021-02-08-18:50
 */
@Data
public class VideoData {
    /**
     * av
     */
    private long aid;

    /**
     * 弹幕数量
     */
    private long danmaku;

    /**
     * 观看数
     */
    private long view;

    /**
     * 评论数
     */
    private long reply;

    /**
     * 投币
     */
    private long coin;

    /**
     * 点赞
     */
    private long like;

    /**
     * 收藏
     */
    private long favorite;

    /**
     * 分享
     */
    private long share;

    /**
     * 当前排名
     */
    private long now_rank;

    /**
     * 全站最高
     */
    private long his_rank;

    /**
     * 踩
     */
    private long dislike;

    /**
     * 评分
     */
    private String evaluation;


}
