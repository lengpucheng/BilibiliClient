package cn.hll520.linling.biliClient.utils.dynamic;

import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述： 动态分类信息类
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-15:20
 * @since 2021-02-08-15:20
 */
@Data
public class DynamicSortInfo extends DynamicInfo {
    private Map<Dynamic.DType, DynamicInfo> sortInfo = new HashMap<>();

    public DynamicSortInfo() {
    }

    public DynamicSortInfo(List<Dynamic> dynamics) {
        super(dynamics);
    }

    @Override
    public DynamicInfo analyze() {
        if (getDynamics() != null && !getDynamics().isEmpty()) {
            // 分类
            getDynamics().forEach(dynamic -> toInfo(dynamic.getType()).getDynamics().add(dynamic));
            // 分析
            sortInfo.forEach((type, dynamicInfo) -> {
                dynamicInfo.analyze();
                setViewAll(getViewAll() + dynamicInfo.getViewAll());
                setLikeAll(getLikeAll() + dynamicInfo.getLikeAll());
                setCommentAll(getCommentAll() + dynamicInfo.getCommentAll());
                setRepostAll(getRepostAll() + dynamicInfo.getRepostAll());
                setCoinAll(getCoinAll() + dynamicInfo.getCoinAll());
            });
            setCount(getDynamics().size());
        }
        return this;
    }

    /**
     * 从 map 中获取种类的 值
     *
     * @param type 类别
     * @return 总类
     */
    private DynamicInfo toInfo(Dynamic.DType type) {
        DynamicInfo dynamicInfo = sortInfo.get(type);
        if (dynamicInfo == null) {
            dynamicInfo = new DynamicInfo();
            sortInfo.put(type, dynamicInfo);
        }
        return dynamicInfo;
    }
}
