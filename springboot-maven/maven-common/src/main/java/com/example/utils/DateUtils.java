package com.example.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理
 *
 * @author
 * @date 2016年12月21日 下午12:53:33
 */
public class DateUtils {

    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /**
     * 时间格式(yyyy-MM-dd HH)
     */
    public final static String DATE_TIME_PATTERN_HH = "yyyy-MM-dd HH";

    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN2 = "yyyyMMddHHmmss";

    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    public static Date parse(String date, String pattern) {
        if (date != null && !"".equals(date.trim())) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            ParsePosition pos = new ParsePosition(0);
            return df.parse(date, pos);
        }
        return null;
    }

    public static Date now() {
        return new Date();
    }
}
