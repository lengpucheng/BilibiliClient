package cn.hll520.linling.biliClient.model.user;

import cn.hll520.linling.biliClient.model.LiveRoom;
import cn.hll520.linling.biliClient.model.SysNotice;
import lombok.Data;

/**
 * 描述： 哔哩哔哩用户对象
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-13:51
 * @since 2021-02-07-13:51
 */
@Data
public class User {
    /**
     * UID
     */
    private Long mid;
    /**
     * 名称
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 头像连接
     */
    private String face;
    /**
     * 签名
     */
    private String sign;
    /**
     * rank
     */
    private Long rank = 1000L;
    /**
     * 等级
     */
    private Integer level;

    /**
     * 封禁状态
     * <p>0: 正常</p>
     * <p>1: 封禁</p>
     */
    private Integer silence;

    /**
     * 生日
     * <p>格式 <b>MM-DD</b></p>
     */
    private String birthday;

    /**
     * 硬币数目
     * <p><b>需要登录后才能查看</b></p>
     */
    private Long coins;

    /**
     * 是否具有粉丝胸罩
     */
    private Boolean fans_badge;

    /**
     * 认证信息
     */
    private Official official;

    /**
     * 会员信息
     */
    private Vip vip;

    /**
     * 头像框信息
     */
    private Pendant pendant;

    /**
     * 勋章信息
     */
    private Nameplate nameplate;

    /**
     * 是否关注
     * <b>需要登录，否则为 false</b>
     */
    private Boolean is_followed;

    /**
     * 头图连接
     */
    private String top_photo;

    /**
     * 主题信息
     */
    private Object theme;

    /**
     * 系统通知
     * <p>纪念账号小黑屋等</p>
     * <p>
     * {@code "sys_notice": {
     * "id": 20,
     * "content": "请允许我们在此献上最后的告别，以此纪念其在哔哩哔哩留下的回忆与足迹。请点此查看纪念账号相关说明\u003e",
     * "url": "https://www.bilibili.com/blackboard/help.html#/?qid=fb37c62ca61f4f10b8d17f3dc9051603",
     * "notice_type": 2,
     * "icon": "https://i0.hdslb.com/bfs/space/ca6d0ed2edae23cf348db19cd2c293f2121c1b59.png",
     * "text_color": "#999999",
     * "bg_color": "#e7e7e7"
     * }}
     * </p>
     */
    private SysNotice sys_notice;

    /**
     * 直播间信息
     */
    private LiveRoom live_room;

}
