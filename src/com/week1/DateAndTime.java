package com.week1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 日期和时间
 * @author 张攀华
 * 2019.3.15
 */

public class DateAndTime {

    public static void main(String[] args) {
        //获取今天的日期
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);
        //获取年月日
        LocalDate today1 = LocalDate.now();
        int year = today1.getYear();
        int month = today1.getMonthValue();
        int day = today1.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d t %n ",year,month,day);
        //处理特定日期、生日
        LocalDate dateOfBirth = LocalDate.of(1111,11,11);
        System.out.println("Your date of birth is :" + dateOfBirth);
        //判断两个日期是否相等
        LocalDate date1 = LocalDate.of(2019,03,15);
        if (date1.equals(today)){
            System.out.printf("Today %s and  date1 %s are same date %n", today, date1);
        }
        //检查像生日这张周期性事件
        LocalDate dateOfBirth1 = LocalDate.of(2019,03,15);
        MonthDay birthday = MonthDay.of(dateOfBirth1.getMonth(),dateOfBirth1.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(birthday)){
            System.out.println("Happy birthday to you !" );
        }else {
            System.out.println("Today is not your birthday");
        }
        //获取当前时间
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
        //在现有的基础上增加小时
        LocalTime time1 = LocalTime.now();
        LocalTime newTime = time1.plusHours(2);//adding two hours
        System.out.println("Time after 2 hours : " + newTime);
        //计算一周后的日期
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today);
        System.out.println("Date after 1 week : " + nextWeek);
        //使用Java 8 的Clock时钟类
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);
        //用Java判断日期是早于还是晚于另一个日期
        LocalDate tomorrow = LocalDate.of(2019,03,16);
        if (tomorrow.isAfter(today)){
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1,DAYS);
        if (yesterday.isBefore(today)){
            System.out.println("Yesterday is day before today");
        }
        //在Java 8 中处理时区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateAndTime,america);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
        //信用卡到期这类固定日期，答案就在YearMonth
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s : %d%n",currentYearMonth,currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2018,Month.MARCH);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
        //在Java 8 中检查闰年
        if (today.isLeapYear()){
            System.out.println("This year is Leap year");
        }else{
            System.out.println("2019 is not a leap year");
        }
        //计算两个日期之间的天数和月数
        LocalDate java8Release = LocalDate.of(2019,Month.MARCH,14);
        Period periodToNextJavaRelease = Period.between(today,java8Release);
        System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths());
        //包含时差信息的日期和时间
        LocalDateTime dateTime = LocalDateTime.of(2019,Month.MARCH,14,19,30);
        ZoneOffset offset = ZoneOffset.of("+05:30");
        OffsetDateTime date = OffsetDateTime.of(dateTime,offset);
        System.out.println("Date and Time with timezone offset in Java: " + date);
        //在Java8中获取当前的时间戳
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant" + timestamp);
        //在Java8中如何使用预定义的格式化工具去解析或格式化日期
        String dayAfterTommorrow = "20190315";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
       System.out.printf("Date generated from String %s is %s %n",dayAfterTommorrow,formatted);
        //在Java中使用自定义格式化工具解析日期
        String goodFriday = "2019.03.15";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate holiday = LocalDate.parse(goodFriday,formatter);
            System.out.printf("Successfully parse String %s, date is %s%n", goodFriday,holiday);
        }catch (DateTimeParseException ex){
            System.out.printf("%s is not parsable !%n",goodFriday);
            ex.printStackTrace();
        }
        //在Java8中如何把日期转换成字符串
        LocalDateTime arrivalDate = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at : %s %n", landing);
        }catch (DateTimeParseException ex){
            System.out.printf("%s can't be formatted !%n",arrivalDate);
            ex.printStackTrace();
        }
    }
}
