package cn.hll520.linling.biliClient.client;

/**
 * 描述：默认客户端工厂类
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-15:38
 * @since 2021-02-07-15:38
 */
public class BaseClientFactory {

    /**
     * 默认返回
     *
     * @return 基本客户端
     */
    public static BaseClient getBaseClient() {
        return new BaseClientDefault();
    }
}
