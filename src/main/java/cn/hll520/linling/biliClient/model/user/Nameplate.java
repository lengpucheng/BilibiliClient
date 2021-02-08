package cn.hll520.linling.biliClient.model.user;

import lombok.Data;

/**
 * 描述： 勋章信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:20
 * @since 2021-02-07-14:20
 */
@Data
public class Nameplate {
    /**
     * 胸罩id
     */
    private Long nid;

    /**
     * 胸罩名称
     */
    private String name;

    /**
     * 胸罩url 标准画质
     */
    private String image;

    /**
     * 胸章url 略缩图
     */
    private String image_small;

    /**
     * 勋章等级
     */
    private String level;

    /**
     * 获取条件
     */
    private String condition;
}
