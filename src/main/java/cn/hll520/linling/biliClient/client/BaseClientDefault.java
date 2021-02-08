package cn.hll520.linling.biliClient.client;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * 描述： 默认基本路径客户端
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:44
 * @since 2021-02-07-14:44
 */
public class BaseClientDefault implements BaseClient {

    /**
     * 协议
     */
    static String protocol = "https";
    /**
     * host
     */
    static String host = "api.bilibili.com";
    /**
     * port
     */
    static int port = 443;

    /**
     * 配置
     */
    static RequestConfig config;

    /**
     * host vc
     */
    static String hostVc = "api.vc.bilibili.com";

    @Override
    public String getProtocol() {
        return protocol;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public String getHostVC() {
        return hostVc;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public RequestConfig getRequestConfig() {
        if (config != null) {
            return config;
        }
        return RequestConfig.custom()
                // 设置连接超时时间(单位毫秒)
                .setConnectTimeout(5000)
                // 设置请求超时时间(单位毫秒)
                .setConnectionRequestTimeout(5000)
                // socket读写超时时间(单位毫秒)
                .setSocketTimeout(5000)
                // 设置是否允许重定向(默认为true)
                .setRedirectsEnabled(true).build();
    }

    @Override
    public HttpClient getHttpClient() {
        BasicCookieStore basicCookieStore = new BasicCookieStore();
//        basicCookieStore.addCookie(new BasicClientCookie());
        return HttpClientBuilder.create().setDefaultCookieStore(basicCookieStore).build();

    }


}
