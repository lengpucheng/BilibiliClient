package cn.hll520.linling.biliClient.api.user;

import cn.hll520.linling.biliClient.BiliCondition;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.model.user.User;

/**
 * 描述：用户请求条件
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:40
 * @since 2021-02-07-14:40
 */
public interface IUserCondition extends BiliCondition {
    /**
     * 获取指定用户的用户信息
     *
     * @param uid uid
     * @return get
     */
    Gettable<User> withUID(Long uid);

    /**
     * 获取当前登录用户信息
     *
     * @return get
     */
    Gettable<User> withMe();
}
