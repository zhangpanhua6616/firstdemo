package com.week2;

import java.util.Date;

/**
 * 日历类
 * @author 张攀华
 * 2019.3.22
 */
public class Calendar {
    public static void main(String[] args) {
       java.util.Calendar calendar = java.util.Calendar.getInstance();//创建Calendar对象
        int year = calendar.get(java.util.Calendar.YEAR);//获取年
        int month = calendar.get(java.util.Calendar.MONTH)+1;//获取月份，0表示1月份
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);//获取日期
        int hour = calendar.get(java.util.Calendar.HOUR);
        int minute = calendar.get(java.util.Calendar.MINUTE);
        int second = calendar.get(java.util.Calendar.SECOND);
        System.out.println("当前时间："+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
        Date date = calendar.getTime();//将Calendar对象转换为Date对象
        Long time = calendar.getTimeInMillis();//获取当前毫秒数
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒数："+time);
    }
}
