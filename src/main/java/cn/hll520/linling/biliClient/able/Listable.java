package cn.hll520.linling.biliClient.able;

/**
 * 描述： 批量获取
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-05-16:03
 * @since 2021-02-05-16:03
 */
public interface Listable<T> extends BiliAbel<T> {
    /**
     * 批量返回
     *
     * @return 批量对象
     */
    T list();

    /**
     * 批量返回 带参数
     *
     * @param limit  size
     * @param offset 偏移量
     * @return 批量对象
     */
    T list(Long limit, Long offset);

    /**
     * 批量返回
     *
     * @param nextOffset next 偏移量
     * @return 批量对象
     */
    T list(Long nextOffset);

    /**
     * 分页
     *
     * @param size 每页大小
     * @param page 页数
     * @return T
     */
    default T listPage(Long size, Long page) {
        return list(size, ((page >= 1 ? (page - 1) : 0) * size));

    }

}
