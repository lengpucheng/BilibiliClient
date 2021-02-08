package cn.hll520.linling.biliClient.model.dynamic;

import lombok.Data;

/**
 * 描述： 图片
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-20:21
 * @since 2021-02-07-20:21
 */
@Data
public class Picture {
    /**
     * 图片地址
     */
    private String img_src;
    /**
     * 图片大小
     */
    private Double img_size;
    /**
     * 图片宽度
     */
    private Integer img_width;
    /**
     * 图片高度
     */
    private Integer img_height;

    /**
     * 图片标签
     * <p> 目前为 List 对象 </p>
     * <p>{@code [
     * {
     * "item_id": 0,
     * "tid": 504355,
     * "mid": 0,
     * "text": "螺蛳粉",
     * "type": 3,
     * "source_type": 0,
     * "url": "",
     * "schema_url": "",
     * "jump_url": "",
     * "orientation": 2,
     * "x": 65122,
     * "y": 83945,
     * "poi": ""
     * },
     * {
     * "item_id": 0,
     * "tid": 1433935,
     * "mid": 0,
     * "text": "武汉纺织大学",
     * "type": 3,
     * "source_type": 0,
     * "url": "",
     * "schema_url": "",
     * "jump_url": "",
     * "orientation": 2,
     * "x": 61298,
     * "y": 95691,
     * "poi": ""
     * }
     * ]}</p>
     */
    private Object img_tags;

}
