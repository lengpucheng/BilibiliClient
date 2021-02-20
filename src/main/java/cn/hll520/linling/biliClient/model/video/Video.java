package cn.hll520.linling.biliClient.model.video;

import cn.hll520.linling.biliClient.model.BaseModel;
import cn.hll520.linling.biliClient.model.user.User;
import cn.hll520.linling.biliClient.utils.TransDate;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 描述： 视频稿件对象
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-18:37
 * @since 2021-02-08-18:37
 */
@Data
public class Video implements BaseModel {
    /**
     * bv
     */
    private String bvid;

    /**
     * av
     */
    private long aid;

    /**
     * p 数
     */
    private long videos;
    /**
     * 分区 id
     */
    private long tid;

    /**
     * 小区名
     */
    private String tname;

    /**
     * 视频类型
     * <p>1 自制</p>
     * <p>2 转载</p>
     */
    private Integer copyright;

    /**
     * 封面图片
     */
    private String pic;
    /**
     * 标题
     */
    private String title;
    /**
     * 发布时间
     */
    private long pubdate;
    /**
     * 上传时间
     */
    private long ctime;

    /**
     * 视频简介
     */
    private String desc;

    /**
     * 稿件状态
     * <p>1	橙色通过	</p>
     * <p>0	开放浏览	</p>
     * <p>-1	待审	</p>
     * <p>-2	被打回	</p>
     * <p>-3	网警锁定	</p>
     * <p> -4	被锁定	视频撞车了</p>
     * <p> -5	管理员锁定	</p>
     * <p>-6	修复待审	</p>
     * <p>-7	暂缓审核	</p>
     * <p> -8	补档待审	</p>
     * <p>-9	等待转码	</p>
     * <p>-10	延迟审核	</p>
     * <p>-11	视频源待修	</p>
     * <p>-12	转储失败	</p>
     * <p>-13	允许评论待审	</p>
     * <p>-14	临时回收站	</p>
     * <p>-15	分发中	</p>
     * <p>-16	转码失败	</p>
     * <p>-20	创建未提交	</p>
     * <p>-30	创建已提交	</p>
     * <p>-40	定时发布	</p>
     * <p>-100	用户删除</p>
     */
    private Integer state;

    /**
     * 关闭缓存
     */
    private Boolean no_cache;

    /**
     * 总时长 秒
     */
    private Long duration;

    /**
     * 视频属性
     * <p>{@code "rights": {
     * "bp": 0,
     * "elec": 0,
     * "download": 1,
     * "movie": 0,
     * "pay": 0,
     * "hd5": 1,
     * "no_reprint": 1,
     * "autoplay": 1,
     * "ugc_pay": 0,
     * "is_cooperation": 0,
     * "ugc_pay_preview": 0,
     * "no_background": 0,
     * "clean_mode": 0,
     * "is_stein_gate": 0
     * }}</p>
     */
    private Object rights;
    /**
     * 视频所有者
     */
    private User owner;

    /**
     * 视频数据
     */
    private VideoData stat;

    /**
     * 动态内容
     */
    private String dynamic;
    /**
     * 尚不明确
     */
    private long cid;
    /**
     * 分辨率
     */
    private Dimension dimension;
    /**
     * 分P 信息
     * <p>{@code  "pages": [
     * {
     * "cid": 237377194,
     * "page": 1,
     * "from": "vupload",
     * "part": "【武汉纺织大学】你 要 在 纺 大 跳 舞 吗～",
     * "duration": 187,
     * "vid": "",
     * "weblink": "",
     * "dimension": {
     * "width": 3840,
     * "height": 2160,
     * "rotate": 0
     * }
     * }
     * ]}</p>
     */
    private List<VideoPage> pages;

    /**
     * 字幕信息
     * <p>{@code "subtitle": {
     * "allow_submit": false,
     * "list": []
     * }}</p>
     */
    private Object subtitle;

    /**
     * 合作者信息
     * <b>List </b>
     */
    private List<User> staff;

    /**
     * 用户穿衣信息
     * <p>{@code "user_garb": {
     * "url_image_ani_cut": ""
     * }}</p>
     */
    private Object user_garb;

    @Override
    public Date createTime() {
        return TransDate.timestampToDate(this.ctime);
    }
}
