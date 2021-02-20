package cn.hll520.linling.biliClient.model.relation;

import cn.hll520.linling.biliClient.model.BaseModel;
import cn.hll520.linling.biliClient.model.user.User;
import cn.hll520.linling.biliClient.utils.TransDate;
import lombok.Data;

import java.util.Date;

/**
 * 描述： 关注者
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:34
 * @since 2021-02-08-16:34
 */
@Data
public class Follower extends User implements BaseModel {
    /**
     * 关注/被关 时间
     */
    private long mtime;

    /**
     * 名称
     */
    private String uname;

    @Override
    public Date createTime() {
        return TransDate.timestampToDate(this.mtime);
    }
}
