package cn.hll520.linling.biliClient.api.user;

import cn.hll520.linling.biliClient.BiliClient;
import cn.hll520.linling.biliClient.BiliClientFactor;
import cn.hll520.linling.biliClient.model.user.User;
import org.junit.Test;

/**
 * 描述： 用户测试
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-19:22
 * @since 2021-02-07-19:22
 */
public class IUserConditionTest {
    private final BiliClient biliClient = BiliClientFactor.getClient();

    @Test
    public void withUID() {
        User user = biliClient.user().withUID(392819792L).get();
        System.out.println(user);
        System.out.println(user.getBirthday());
        System.out.println(user.getName());
        System.out.println(user.getOfficial());
    }

    @Test
    public void withMe() {
    }
}