package cn.hll520.linling.biliClient.model;

import java.util.Date;

/**
 * 描述： 通用模型接口
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-20-13:37
 * @since 2021-02-20-13:37
 */
public interface BaseModel {
    /**
     * 获取当前创建时间 默认为 当前时间
     *
     * @return date
     */
    default Date createTime() {
        return new Date();
    }

    /**
     * 获取当前修改时间 默认为 创建时间
     *
     * @return date
     */
    default Date updateTime() {
        return this.createTime();
    }

}
