package cn.hll520.linling.biliClient.model.user;

import lombok.Data;

/**
 * 描述： 哔哩哔哩会员信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:07
 * @since 2021-02-07-14:07
 */
@Data
public class Vip {

    /**
     * 会员类型
     * <p>0 无会员</p>
     * <p>1 包月会员</p>
     * <p>2 年费会员</p>
     */
    private Integer type;

    /**
     * 是否有会员
     * <p>0 无</p>
     * <p>1 有</p>
     */
    private Integer status;

    /**
     * 主题类型 默认 ""
     */
    private Integer theme_type;

    /**
     * 标签
     * <p>
     * {@code
     * "label": {
     * "path": "",
     * "text": "",
     * "label_theme": ""
     * }
     * }
     * </p>
     */
    private Label label;

    /**
     * 是否外显会员
     * <p>0 不显示</p>
     * <p>1 显示</p>
     */
    private Integer avatar_subscript;

    /**
     * 活动昵称颜色代码  默认 ""
     * <p> 粉色或绿色(愚人节) </p>
     */
    private String nickname_color;


    @Data
    public static class Label {
        /**
         * 渠道路径
         */
        private String path;

        /**
         * 名称
         */
        private String text;

        /**
         * 标签
         * <p>vip：大会员</p>
         * <p>annual_vip：年度大会员</p>
         * <p>ten_annual_vip：十年大会员</p>
         * <p>hundred_annual_vip：百年大会员</p>
         */
        private String label_theme;
    }
}
