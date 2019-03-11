package com.exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int n= 3;
        try {
            System.out.println(n/0);
        }catch (ArithmeticException e){
            System.err.println("除数不能为0！！");
        }
    }
}
