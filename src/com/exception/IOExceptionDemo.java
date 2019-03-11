package com.exception;

import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        //文件指针指向d盘的1.jpg文件
        File file = new File("d:/1.jpg");
        //定义一个字节数组，长度和文件长度相等，用来读取文件
        byte[] b = new byte[(int) file.length()];
        InputStream inputStream = null;
        try {
            //通过file来创建字节输入流，如果文件不存在，会抛出FileNotFoundException
            inputStream = new FileInputStream(file);
            try {
                //通过字节输入流来读取文件内容到字节数组b中，会抛出IOException
                inputStream.read(b);
            } catch (IOException e) {
                System.err.println("字节流读取出现异常！");
            }
        } catch (FileNotFoundException e) {
            System.err.println("文件找不到！");
        }
        //关闭字节输入流，会抛IOException
        try {
            inputStream.close();
        } catch (IOException e) {
            System.err.println("字节流关闭出现异常！");
        }
    }
}
