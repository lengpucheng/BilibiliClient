package cn.hll520.linling.biliClient.model.relation;

import cn.hll520.linling.biliClient.model.user.User;
import lombok.Data;

/**
 * 描述： 关注者
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:34
 * @since 2021-02-08-16:34
 */
@Data
public class Follower extends User {
    /**
     * 关注/被关 时间
     */
    private long mtime;

    /**
     * 名称
     */
    private String uname;

}
