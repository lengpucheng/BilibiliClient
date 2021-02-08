package cn.hll520.linling.biliClient.able;

/**
 * 描述： 更新对象
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:05
 * @since 2021-02-05-16:05
 */
public interface Updatable<T> extends BiliAbel<T> {
    /**
     * 更新对象
     *
     * @param t new 对象
     * @return newed 对象
     */
    T update(T t);

}
