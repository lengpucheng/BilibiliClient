package cn.hll520.linling.biliClient.api.user;

/**
 * 描述：用户相关path
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:41
 * @since 2021-02-07-14:41
 */
public interface UserPath {
    /**
     * 指定用户信息
     * <p>mid ---  uid</p>
     */
    String USER_INFO = "/x/space/acc/info";

    /**
     * 当前用户信息
     */
    String USER_MY_INFO = "/x/space/myinfo";
}
