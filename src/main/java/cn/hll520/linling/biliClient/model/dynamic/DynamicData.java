package cn.hll520.linling.biliClient.model.dynamic;

import lombok.Data;

/**
 * 描述： 动态 数据
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-21:06
 * @since 2021-02-07-21:06
 */
@Data
public class DynamicData {
    /**
     * 动态类型
     */
    private Integer type;
    /**
     * 作者ID
     */
    private Long uid;
    /**
     * 动态 id
     */
    private Long dynamic_id;
    /**
     * 源ID
     * <p>非转发为0 或 Null</p>
     */
    private Long orig_dy_id;

    /**
     * 时间
     */
    private Long timestamp;
    /**
     * 阅读
     */
    private long view;

    /**
     * 转发
     */
    private long repost;
    /**
     * 评论
     */
    private long comment;

    /**
     * 点赞
     */
    private long like;
    /**
     * 是否点赞
     * <p>0  否/未登录</p>
     * <p>1  是</p>
     */
    private Integer is_liked;

    /**
     * 视频 bvid
     * <p>仅仅视频动态存在 其余为null or empty</p>
     */
    private String bvid;
}
