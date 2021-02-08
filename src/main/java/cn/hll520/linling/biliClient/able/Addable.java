package cn.hll520.linling.biliClient.able;

/**
 * 描述： 添加
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:08
 * @since 2021-02-05-16:08
 */
public interface Addable<T> extends BiliAbel<T> {
    /**
     * 添加对象
     *
     * @param t new 对象
     * @return added 对象
     */
    T add(T t);
}
