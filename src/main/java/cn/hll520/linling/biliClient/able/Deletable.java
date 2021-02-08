package cn.hll520.linling.biliClient.able;

/**
 * 描述： 删除
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:08
 * @since 2021-02-05-16:08
 */
public interface Deletable<T> extends BiliAbel<T> {
    /**
     * 删除对象
     *
     * @return 删除对象是否成功
     */
    Boolean delete();
}
