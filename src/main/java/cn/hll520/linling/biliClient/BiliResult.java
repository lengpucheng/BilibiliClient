package cn.hll520.linling.biliClient;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 描述： 哔哩哔哩 通用 响应
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-03-20:39
 * @since 2021-02-03-20:39
 */
@Data
public class BiliResult {
    /**
     * 响应码
     * <p>0     成功 </p>
     * <p>-400  请求失败</p>
     * <p>-101  未登录</p>
     */
    private Integer code;
    /**
     * 请求消息
     */
    private String message;
    /**
     * 实际数据
     */
    private Object data;
    /**
     * 消息
     */
    private String msg;
    /**
     * ttl
     */
    private Integer ttl;

    /**
     * 获取数据 对象
     *
     * @param tClass 类型
     * @param <T>    对象
     * @return t
     */
    public <T> T toData(Class<T> tClass) {
        return JSONObject.parseObject(data.toString(), tClass);
    }

    /**
     * 获取包含的错误信息
     *
     * @return 信息
     */
    public String toMessage() {
        if (message != null && message.isEmpty()) {
            return message;
        }
        return msg;
    }

    /**
     * 检验当前请求
     *
     * @return 若检测无误返回当前
     */
    public BiliResult check() {
        switch (this.code) {
            case -400:
                System.err.println(this.toString());
                throw new RuntimeException("发起请求异常！" + this.toMessage());
            case -101:
                System.err.println(this.toString());
                throw new RuntimeException("请求需要认证！" + this.toMessage());
            case 0:
                return this;
            default:
                System.err.println(this.toString());
                throw new RuntimeException("请求错误" + this.toMessage());
        }
    }

}