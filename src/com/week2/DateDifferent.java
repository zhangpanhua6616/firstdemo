package com.week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间的计算
 * @author 张攀华
 * 2019.3.18
 */
public class DateDifferent {
    public static void main(String[] args) {
        String firstTime = "2019-3-16 10:30:20";
        String thirdTime = "2019-3-18 7:10:20 ";
        String forthTime = "2019-3-18 8:20:30 ";
        String fifthTime = "2019-3-18 13:10:20";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        String secondTime = format.format(currentTime);
        Date d1,d2,d3,d4,d5;
        long diff1 = 0;
        long diff2 = 0;
        long diff3 = 0;

        //通过SampleDateFormat的对象来把String类型的时间对象转化为Date类型的对象
        try {
            d1 = format.parse(firstTime);
            d2 = format.parse(secondTime);
            d3 = format.parse(thirdTime);

            d5 = format.parse(fifthTime);
            //毫秒的差值
            diff1 = d2.getTime() - d1.getTime();
            diff2 = d2.getTime() - d3.getTime();
            diff3 = d2.getTime() - d5.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        //将毫秒分别换算成分、小时 、天
        long diffMinutes =  diff3/(1000 * 60);
        long diffHours = diff2/(1000 * 60 * 60);
        long diffDays = diff1/(1000 * 60 * 60 * 24);
        System.out.println("现在时间：" + secondTime);
        System.out.println("2019-3-16 10:30:20  ：" + Math.abs(diffDays) + "天前");
        System.out.println("2019-3-18 7:10:20   ：" + Math.abs(diffHours) + "小时前");
        System.out.println("2019-3-18 8:20:30   ：" + Math.abs(diffMinutes) + "分前");
        System.out.println("2019-3-18 13:10:20  ：" + "刚刚");
    }
}
