package cn.hll520.linling.biliClient.model.user;

import lombok.Data;

/**
 * 描述： 用户认证信息
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-07-14:00
 * @since 2021-02-07-14:00
 */
@Data
public class Official {
    /**
     * 角色类型
     * <p>0: 无认证</p>
     * <p>1\2 个人认证  -- 知名\专栏</p>
     * <p>3\4\5\6 机构认证认证  --- 企业\媒体\政府组织</p>
     */
    private Integer role;

    /**
     * 认证信息
     */
    private String title;

    /**
     * 认证备注
     */
    private String desc;

    /**
     * 是否认证
     * <p> 0 未认证 </p>
     * <p> 1 认证 </p>
     */
    private Integer type;
}
