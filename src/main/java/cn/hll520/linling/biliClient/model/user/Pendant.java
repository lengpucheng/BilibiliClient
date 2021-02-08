package cn.hll520.linling.biliClient.model.user;

import lombok.Data;

/**
 * 描述： 头像框信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:17
 * @since 2021-02-07-14:17
 */
@Data
public class Pendant {
    /**
     * 头像框ID
     */
    private Long pid;
    /**
     * 头像框名称
     */
    private String name;

    /**
     * 头像框URL
     */
    private String image;

    /**
     * 到期时间
     */
    private Long expire;

    /**
     * 图形画质提升
     */
    private String image_enhance;
    /**
     * 图形画质提升框架
     */
    private String image_enhance_frame;
}
