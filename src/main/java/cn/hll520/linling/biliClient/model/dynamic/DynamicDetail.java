package cn.hll520.linling.biliClient.model.dynamic;

import lombok.Data;

import java.util.List;

/**
 * 描述：动态详情
 * <p>data.card.desc.card.item</p>
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-20:17
 * @since 2021-02-07-20:17
 */
@Data
public class DynamicDetail {
    /**
     * 详情ID
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 动态详情
     */
    private String description;

    /**
     * 分类类型
     */
    private String category;

    /**
     * 角色 List
     */
    private Object role;

    /**
     * 来源 List
     */
    private Object source;

    /**
     * 图片
     */
    private List<Picture> pictures;

    /**
     * 图片数量
     */
    private Integer pictures_count;

    /**
     * 更新时间
     */
    private Long upload_time;

    /**
     * 回复数量
     */
    private Long reply;

    /**
     * 设置
     * <p>{@code {
     * "copy_forbidden": "0"
     * }}</p>
     */
    private Object settings;

    /**
     * 是否喜欢
     * <p>0  否</p>
     * <p>1  是</p>
     */
    private Integer is_fav;
}
