package cn.hll520.linling.biliClient.model.dynamic;

import lombok.Data;

/**
 * 描述： 动态转发
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-21:13
 * @since 2021-02-07-21:13
 */
@Data
public class DynamicRepost {
    /**
     * 转发详情
     */
    private String content;
    /**
     * 转发时间
     */
    private Long timestamp;
}
