package cn.hll520.linling.biliClient;

/**
 * 描述： 请求工厂类
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:57
 * @since 2021-02-08-16:57
 */
public class BiliRequestFactor {
    /**
     * 获取应该请求
     *
     * @return 请求
     */
    public static BiliRequest getBiliRequest() {
        return new BiliRequest();
    }
}
