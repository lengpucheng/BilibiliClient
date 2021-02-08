package cn.hll520.linling.biliClient.api.user;

import cn.hll520.linling.biliClient.BiliRequestFactor;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.model.user.User;

/**
 * 描述： 用户条件
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-15:37
 * @since 2021-02-07-15:37
 */
public class UserConditionImpl implements IUserCondition {
    @Override
    public Gettable<User> withUID(Long uid) {
        return new UserGet(BiliRequestFactor.getBiliRequest().setPath(UserPath.USER_INFO)
                .setParams("mid", String.valueOf(uid)));
    }

    @Override
    public Gettable<User> withMe() {
        return new UserGet(BiliRequestFactor.getBiliRequest().setPath(UserPath.USER_MY_INFO));
    }
}
