package cn.hll520.linling.biliClient.model.dynamic;

import cn.hll520.linling.biliClient.BiliResult;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 描述： 集合列表
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-22:14
 * @since 2021-02-07-22:14
 */
@Slf4j
@Data
public class DynamicItems {
    /**
     * 是否还有更多
     * <p>1 是</p>
     * <p>0 否</p>
     */
    private Integer hasMore;

    /**
     * dynamic 集合
     * <p>为避免空指针,默认为null集合</p>
     */
    private List<Dynamic> items = new ArrayList<>();

    /**
     * 下一次请求偏移量
     * <p>第一次为0</p>
     */
    private Long nextOffset = 0L;

    /**
     * 根据 result 构建
     * <p>解析错误将返回null 对象</p>
     *
     * @param result 响应结果
     * @return di
     */
    public static DynamicItems build(BiliResult result) {
        try {
            DynamicItems dynamicItems = result.toData(DynamicItems.class);
            // 没有更多就返回包含源数据的对象
            if (dynamicItems.hasMore != 1) {
                return dynamicItems;
            }

            // 否则进行遍历 并过滤空对象
            List<Dynamic> cards = JSONObject.parseObject(result.getData().toString()).getJSONArray("cards")
                    .toJavaList(DynamicCard.class).stream().map(DynamicCard::toDynamic).filter(Objects::nonNull)
                    .collect(Collectors.toList());
            dynamicItems.setItems(cards);

            // 返回
            return dynamicItems;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("当前请求解析异常!原始请求数据为\n {}", result);
            return null;
        }

    }
}
