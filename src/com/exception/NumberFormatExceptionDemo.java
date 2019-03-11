package com.exception;

/**
 * 数据格式转换异常
 */
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String a = "123a";
        int n = 0;
        try {
            n = Integer.parseInt(a);
        }catch (NumberFormatException e){
            System.err.println("格式转换出现异常");
        }
        System.out.println("n="+n);
    }
}
