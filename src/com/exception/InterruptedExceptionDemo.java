package com.exception;

public class InterruptedExceptionDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.err.println("出现中断异常！");
        }
    }
}
