package cn.hll520.linling.biliClient.client;

import org.apache.http.client.config.RequestConfig;

/**
 * 描述： 配置客户端信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-15:10
 * @since 2021-02-07-15:10
 */
public class BaseClientConfig {
    /**
     * 设置 协议
     *
     * @param protocol 协议
     * @return this
     */
    public BaseClientConfig setProtocol(String protocol) {
        if (protocol != null) {
            BaseClientDefault.protocol = protocol;
        }
        return this;
    }

    /**
     * 设置 host
     *
     * @param host host
     * @return this
     */
    public BaseClientConfig setHost(String host) {
        if (host != null) {
            BaseClientDefault.host = host;
        }
        return this;
    }

    /**
     * 配置host vc
     *
     * @param hostVc host vc
     * @return this
     */
    public BaseClientConfig setHostVc(String hostVc) {
        if (hostVc != null) {
            BaseClientDefault.hostVc = hostVc;
        }
        return this;
    }

    /**
     * 设置端口
     *
     * @param port 端口
     * @return 端口
     */
    public BaseClientConfig setPort(Integer port) {
        if (port != null) {
            BaseClientDefault.port = port;
        }
        return this;
    }

    /**
     * 设置请求配置
     *
     * @param config 请求配置
     * @return this
     */
    public BaseClientConfig setRequestConfig(RequestConfig config) {
        if (config != null) {
            BaseClientDefault.config = config;
        }
        return this;
    }
}
