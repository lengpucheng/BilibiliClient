package cn.hll520.linling.biliClient.api.dynamic;

import cn.hll520.linling.biliClient.BiliCall;
import cn.hll520.linling.biliClient.BiliRequest;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.model.dynamic.Dynamic;
import cn.hll520.linling.biliClient.model.dynamic.DynamicCard;
import com.alibaba.fastjson.JSONObject;

/**
 * 描述： 动态获取
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-21:25
 * @since 2021-02-07-21:25
 */
public class DynamicGet implements Gettable<Dynamic> {
    private final BiliRequest request;

    public DynamicGet(BiliRequest request) {
        this.request = request;
    }

    @Override
    public Dynamic get() {
        Object data = BiliCall.doCall(request).getData();
        return JSONObject.parseObject(data.toString()).getJSONObject("card")
                .toJavaObject(DynamicCard.class).toDynamic();

    }
}
