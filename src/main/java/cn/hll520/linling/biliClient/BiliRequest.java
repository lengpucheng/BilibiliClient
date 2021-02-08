package cn.hll520.linling.biliClient;

import cn.hll520.linling.biliClient.client.BaseClient;
import cn.hll520.linling.biliClient.client.BaseClientFactory;
import cn.hll520.linling.biliClient.exception.BiliRequestException;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * 描述： bili 请求
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:36
 * @since 2021-02-05-16:36
 */
@Slf4j
public class BiliRequest {
    private final BaseClient baseClient;
    private final URIBuilder uriBuilder;

    public BiliRequest() {
        baseClient = BaseClientFactory.getBaseClient();
        uriBuilder = new URIBuilder().setScheme(baseClient.getProtocol()).setHost(baseClient.getHost())
                .setPort(baseClient.getPort());
    }

    /**
     * 使用 client 构建
     *
     * @param client baseClient
     */
    public BiliRequest(BaseClient client, String version) {
        this.baseClient = client;

        uriBuilder = new URIBuilder().setScheme(client.getProtocol()).setHost(client.getHost())
                .setPort(client.getPort());
    }

    /**
     * 使用VC host
     *
     * @return this
     */
    public BiliRequest useHostVC() {
        uriBuilder.setHost(baseClient.getHostVC());
        return this;
    }

    /**
     * 设置host
     *
     * @return this
     */
    public BiliRequest setHost(String host) {
        uriBuilder.setHost(host);
        return this;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     * @return this
     */
    public BiliRequest setPath(String path) {
        uriBuilder.setPath(path);
        return this;
    }

    /**
     * 设置参数
     *
     * @param key   key
     * @param value value
     * @return this
     */
    public BiliRequest setParams(String key, String value) {
        uriBuilder.setParameter(key, value);
        return this;
    }

    /**
     * 设置参数
     *
     * @param key   key
     * @param value value
     * @return this
     */
    public BiliRequest setParams(String key, Object value) {
        uriBuilder.setParameter(key, value == null ? "" : value.toString());
        return this;
    }

    /**
     * 批量设置参数
     *
     * @param params key-value
     * @return this
     */
    public BiliRequest setParams(List<NameValuePair> params) {
        uriBuilder.setParameters(params);
        return this;
    }

    /**
     * 构建URI
     *
     * @return URI
     */
    public URI getURI() {
        try {
            return uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            log.error("构建URI错误");
            throw new BiliRequestException(uriBuilder.getPath(), "URI构建错误");
        }
    }

    /**
     * 获取BaseClient
     *
     * @return 基本客户端
     */
    public BaseClient getBaseClient() {
        return baseClient;
    }

    /**
     * 获取请求地址
     *
     * @return path
     */
    public String getRequestPath() {
        return uriBuilder.getScheme() + "://" + uriBuilder.getHost() + ":" + uriBuilder.getPort()
                + uriBuilder.getPath();
    }
}
