package com.week2;

import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        Week weekArray[] = Week.values();
        //遍历枚举
        for (Week week:weekArray) {
            //提示输入值
            System.out.println("输入英文的星期小写:");
            //键盘接受输入
            Scanner scanner = new Scanner(System.in);
            Week week1 = Week.getResult(scanner.next());
            //输出结果
            System.out.println(week + "    "+ week.getWeekName());

        }
    }
}
