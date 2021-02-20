package cn.hll520.linling.biliClient.utils;

import java.util.Date;

/**
 * 描述：日期转换相关
 *
 * @author lpc lpc@hll520.cn
 * @version 1.0  2021-02-20-13:29
 * @since 2021-02-20-13:29
 */
public class TransDate {

    /**
     * 将秒时间戳转换为date
     *
     * @param timestamp 秒时间戳，默认获取
     * @return date 不正确为当前时间
     */
    public static Date timestampToDate(Long timestamp) {
        if (timestamp != null && timestamp > 0L) {
            return new Date(timestamp * 1000L);
        }
        return new Date();
    }

    /**
     * 获取当前秒时间戳
     *
     * @return 秒时间戳
     */
    public static long nowTimestamp() {
        return System.currentTimeMillis() / 1000L;
    }

    /**
     * 从date 获取秒时间戳
     *
     * @param date date
     * @return 秒时间戳 date为null返回当前
     */
    public static long dateToTimestamp(Date date) {
        if (date == null) {
            return nowTimestamp();
        }
        return date.getTime() / 1000L;
    }
}
