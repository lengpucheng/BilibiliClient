package cn.hll520.linling.biliClient.api.relation;

/**
 * 描述： 关系路径
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-08-16:26
 * @since 2021-02-08-16:26
 */
public interface RelationPath {
    /**
     * 粉丝列表
     */
    String RELATION_FOLLOWERS = "/x/relation/followers";

    /**
     * 关注列表
     */
    String RELATION_FOLLOWINGS = "/x/relation/followings";
}
