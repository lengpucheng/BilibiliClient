package cn.hll520.linling.biliClient.exception;

import java.net.URI;

/**
 * 描述：请求异常
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-03-21:44
 * @since 2021-02-03-21:44
 */
public class BiliRequestException extends RuntimeException {
    /**
     * 请求URI
     */
    private URI uri;

    /**
     * 请求路径
     */
    private String path;

    public BiliRequestException(URI uri) {
        this(uri, "未知错误");
    }

    public BiliRequestException(URI uri, String message) {
        super(message);
        this.uri = uri;
    }

    public BiliRequestException(String path, String message) {
        super(message);
        this.path = path;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "BiliRequestException{" +
                "uri=" + uri +
                ", path='" + path + '\'' +
                "} " + super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        if (path != null) {
            System.err.println("请求错误路径为---> " + path);
        } else {
            System.err.println("请求错误路径为---> " + uri.getScheme() + "://" + uri.getHost() + ":"
                    + uri.getPort() + uri.getPath());
        }
    }
}
