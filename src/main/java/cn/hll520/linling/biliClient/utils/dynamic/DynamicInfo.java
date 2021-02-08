package cn.hll520.linling.biliClient.utils.dynamic;

import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述： 动态信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-15:14
 * @since 2021-02-08-15:14
 */
@Data
public class DynamicInfo {
    /**
     * 动态集合
     */
    protected List<Dynamic> dynamics = new ArrayList<>();
    /**
     * 阅读总数
     */
    protected long viewAll;
    /**
     * 点赞总数
     */
    protected long likeAll;
    /**
     * 转发总数
     */
    protected long repostAll;
    /**
     * 评论总数
     */
    protected long commentAll;
    /**
     * 硬币总数
     */
    protected long coinAll;
    /**
     * 动态总数
     */
    protected long count;

    /**
     * 无参构造
     */
    public DynamicInfo() {
    }

    /**
     * 单参数构造
     *
     * @param dynamics list
     */
    public DynamicInfo(List<Dynamic> dynamics) {
        this();
        this.dynamics = dynamics;
    }

    /**
     * 分析数据
     *
     * @return this
     */
    public DynamicInfo analyze() {
        if (dynamics != null && !dynamics.isEmpty()) {
            dynamics.forEach(dynamic -> {
                viewAll += dynamic.getData().getView();
                likeAll += dynamic.getData().getLike();
                repostAll += dynamic.getData().getRepost();
                commentAll += dynamic.getData().getComment();
                if (dynamic.getType() == Dynamic.DType.VIDEO) {
                    coinAll += dynamic.getVideo().getStat().getCoin();
                }
            });
            count = dynamics.size();
        }
        return this;
    }
}
