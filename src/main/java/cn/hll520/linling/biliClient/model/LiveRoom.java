package cn.hll520.linling.biliClient.model;

import lombok.Data;

/**
 * 描述：直播间信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:28
 * @since 2021-02-07-14:28
 */
@Data
public class LiveRoom {
    /**
     * 房间状态
     * <p>0 无房间</p>
     * <p>1 有房间</p>
     */
    private Integer roomStatus;

    /**
     * 直播状态
     * <p>0 休息</p>
     * <p>1 开播</p>
     */
    private Integer liveStatus;

    /**
     * 直播间地址
     */
    private String url;

    /**
     * 直播间标题
     */
    private String title;

    /**
     * 直播间封面连接
     */
    private String cover;

    /**
     * 上次直播人气
     */
    private Long online;

    /**
     * 直播间ID
     */
    private Long roomid;

    /**
     * 轮播状态
     * <p> 0  无轮播 </p>
     * <p> 1  轮播 </p>
     */
    private Integer roundStatus;

    /**
     * 类型  默认0
     */
    private Integer broadcast_type;
}
