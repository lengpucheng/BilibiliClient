package cn.hll520.linling.biliClient.model.dynamic;

import cn.hll520.linling.biliClient.model.video.Video;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 描述： 动态条目 card
 * <p>result.data.card</p>
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-20:35
 * @since 2021-02-07-20:35
 */
@Slf4j
@Data
public class DynamicCard {
    /**
     * 动态数据
     */
    private DynamicData desc;

    /**
     * 动态实际内容
     * <p>card.item为动态详情或转发详情</p>
     * <p>根据desc 判断是否为转发</p>
     */
    private String card;

    /**
     * 将card 转换为 dynamic 对象
     * <p><b>若解析异常将会传回null 对象</b></p>
     *
     * @return dynamic
     */
    public Dynamic toDynamic() {
        // 空对象抛出null
        if (desc == null || card == null || card.isEmpty()) {
            return null;
        }
        try {
            Dynamic dynamic = new Dynamic();
            // 设置数据
            dynamic.setData(this.getDesc());
            // 解析动态详情
            JSONObject dynamicCard = JSONObject.parseObject(this.getCard());
            if (this.getDesc().getOrig_dy_id() != null && this.getDesc().getOrig_dy_id() != 0) {
                // 转发
                dynamic.setType(Dynamic.DType.REPOST);
                // 转发内容
                dynamic.setRepost(JSONObject.parseObject(dynamicCard.getString("item"), DynamicRepost.class));
                // 源内容
                JSONObject origin = dynamicCard.getJSONObject("origin");
                // 若源内容违规被屏蔽 避免转换失败
                if (origin != null && !origin.isEmpty()) {
                    dynamic.setDetail(JSONObject.parseObject(origin.getString("item"), DynamicDetail.class));
                }
            } else if (this.getDesc().getBvid() != null && !this.getDesc().getBvid().isEmpty()) {
                // 视频
                dynamic.setType(Dynamic.DType.VIDEO);
                // 视频内容
                dynamic.setVideo(JSONObject.parseObject(dynamicCard.toString(), Video.class));
            } else {
                // 普通动态
                dynamic.setType(Dynamic.DType.COMMON);
                // 写入详情
                dynamic.setDetail(JSONObject.parseObject(dynamicCard.getString("item"), DynamicDetail.class));
            }

            // 解析作者信息
            JSONObject user = null;
            try {
                user = dynamicCard.getJSONObject("user");
                if (user != null && !user.isEmpty()) {
                    dynamic.setUid(Long.valueOf(user.getString("uid")));
                    dynamic.setName(user.getString("name"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                log.error("解析作者信息时发生异常！ 原始数据为{}", user);
            }

            // 返回动态
            return dynamic;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("动态解析遇到错误！可能遇到了格式不支持的动态或该类型为新型动态,原始内容如下\n {}", toString());
            return null;
        }
    }

}
