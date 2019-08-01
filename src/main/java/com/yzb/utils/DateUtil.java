package com.yzb.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 将星期数字转为汉字
     *
     * @param week 数字字符串
     * @return 星期*
     */
    public static String dayToWeek(String week) {
        if (!StringUtil.isBlank(week)) {
            switch (week) {
                case "1":
                    return "星期一";
                case "2":
                    return "星期二";
                case "3":
                    return "星期三";
                case "4":
                    return "星期四";
                case "5":
                    return "星期五";
                case "6":
                    return "星期六";
                case "7":
                    return "星期天";
                default:
                    return null;
            }
        }
        return null;
    }

    public static String dayToWeek(Date date) {
        if (date != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int day = c.get(Calendar.DAY_OF_WEEK);
            switch (day) {
                case 2:
                    return "星期一";
                case 3:
                    return "星期二";
                case 4:
                    return "星期三";
                case 5:
                    return "星期四";
                case 6:
                    return "星期五";
                case 7:
                    return "星期六";
                case 1:
                    return "星期天";
                default:
                    return null;
            }
        }
        return null;
    }

    /**
     * 增加日期天数
     *
     * @param date 需要增加的当前日期
     *             day 增加的天数 如减日期可传负数
     */
    public static Date addDay(Date date, int day) {
        if (date != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DAY_OF_MONTH, day);
            return c.getTime();
        }
        return null;
    }

    /**
     * 增加日期天数
     *
     * @param dateStr 需要增加的当前日期字符串
     *                format 日期字符串的格式 默认yyyy-MM-dd
     *                day 增加的天数 如减日期可传负数
     */
    public static Date addDay(String dateStr, String format, int day) {
        if (dateStr != null) {
            if (format == null) {
                format = "yyyy-MM-dd";
            }
            Date date = formatToDate(dateStr, format);
            if (date != null) {
                return addDay(date, day);
            }
        }
        return null;
    }

    public static Date formatToDate(String date, String format) {
        if (date != null && format != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            try {
                return sdf.parse(date);
            } catch (ParseException e) {
            }
        }
        return null;
    }

    public static String convertForFormat(String date, String oldFormat, String newFormat) {
        if (date != null && oldFormat != null && newFormat != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(oldFormat);
            try {
                Date d = sdf.parse(date);
                sdf.applyPattern(newFormat);
                return sdf.format(d);
            } catch (ParseException e) {
            }
        }
        return null;
    }
}
