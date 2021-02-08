package cn.hll520.linling.biliClient.model;

import lombok.Data;

/**
 * 描述： 系统通知信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:23
 * @since 2021-02-07-14:23
 */
@Data
public class SysNotice {
    /**
     * 通知id
     */
    private Integer id;

    /**
     * 提示信息
     */
    private String content;

    /**
     * 详细说明连接
     */
    private String url;

    /**
     * 通知类型
     * <p> 2 纪念账号 </p>
     */
    private Integer notice_type;

    /**
     * 通知图标连接
     */
    private String icon;

    /**
     * 文本颜色 #16进制
     */
    private String text_color;

    /**
     * 背景颜色 #16进制
     */
    private String bg_color;

}
