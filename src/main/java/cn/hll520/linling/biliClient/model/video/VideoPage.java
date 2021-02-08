package cn.hll520.linling.biliClient.model.video;

import lombok.Data;

/**
 * 描述： 稿件单P
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-19:01
 * @since 2021-02-08-19:01
 */
@Data
public class VideoPage {
    /**
     * cid
     */
    private long cid;

    /**
     * 当前P 数
     */
    private long page;

    /**
     * 来源
     * <p>	vupload 上传</p>
     * <p> huan 芒果TV</p>
     * <p> qq 腾讯视频</p>
     */
    private String from;

    /**
     * 当前P 名称
     */
    private String part;

    /**
     * 当前P 时长 秒
     */
    private String duration;

    /**
     * vid
     */
    private String vid;

    /**
     * 网络连接
     */
    private String weblink;

    /**
     * 分辨率
     */
    private Dimension dimension;
}
