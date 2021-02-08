package cn.hll520.linling.biliClient.api.user;

import cn.hll520.linling.biliClient.BiliCall;
import cn.hll520.linling.biliClient.BiliRequest;
import cn.hll520.linling.biliClient.able.Gettable;
import cn.hll520.linling.biliClient.exception.BiliRequestException;
import cn.hll520.linling.biliClient.model.user.User;

/**
 * 描述： 用户GET
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:58
 * @since 2021-02-07-14:58
 */
public class UserGet implements Gettable<User> {
    private final BiliRequest request;

    public UserGet(BiliRequest request) {
        this.request = request;
    }

    @Override
    public User get() {
        try {
            return BiliCall.doCall(request).toData(User.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BiliRequestException(request.getURI());
        }
    }
}
