package cn.hll520.linling.biliClient.client;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;

/**
 * 描述：
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:32
 * @since 2021-02-05-16:32
 */
public interface BaseClient {
    /**
     * 获取协议
     *
     * @return 协议
     */
    String getProtocol();

    /**
     * 获取根Host
     *
     * @return 根
     */
    String getHost();

    /**
     * 获取根Host vc
     *
     * @return root
     */
    String getHostVC();

    /**
     * 获取端口
     *
     * @return 端口
     */
    int getPort();

    /**
     * 请求配置
     *
     * @return 请求配置
     */
    RequestConfig getRequestConfig();

    /**
     * 获取请求客户端
     *
     * @return 请求客户端
     */
    HttpClient getHttpClient();
}
