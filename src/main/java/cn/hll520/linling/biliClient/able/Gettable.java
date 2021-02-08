package cn.hll520.linling.biliClient.able;

/**
 * 描述：返回一个对象的方法 Gettable
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-15:55
 * @since 2021-02-05-15:55
 */
public interface Gettable<T> extends BiliAbel<T> {
    /**
     * 返回一个对象
     *
     * @return 一个
     */
    T get();
}
