package com.exception;

/**
 * 数组越界异常
 */
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[]arr = new int[5];
        try {
            for (int i = 0;i < 6;i++){
                arr[i] = i+1;
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("数组下标越界");
        }finally {
            System.out.println("数组输出完毕");
        }
    }
}
