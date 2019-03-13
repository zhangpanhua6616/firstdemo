package com.week1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 两点距离
 * @author 张攀华
 * 2019.3.13
 */
public class Distance {
    public static void main(String[] args) throws IOException {
        //生成图片，指定大小
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_BGR);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        Font font = new Font("宋体",Font.BOLD,25);
        graphics.setFont(font);
        //设置画笔颜色
        graphics.setColor(Color.GREEN);
        //开始绘制矩形，充满图片的缓冲区
        graphics.fillRect(0,0,1024,768);
        //生成两个随机点
        Random random = new Random();
        int x1 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int x2 = random.nextInt(1024);
        int y2 = random.nextInt(768);
        //控制台输出两点
        System.out.println("点A:(" + x1 + "," + y1 + ") 点B:(" + x2 + "," + y2 + ")");
        //计算两点距离
        double distance =  Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String string = decimalFormat.format(distance);
        //控制台输出距离
        System.out.println("两点距离" + string);
        //更改画笔颜色
        graphics.setColor(Color.BLACK);
        //绘制线段
        graphics.drawLine(x1,y1,x2,y2);
        //写上线段长度
        graphics.drawString(string,(x1+x2)/2,(y1+y2)/2);
        //输出图片，并指定文件路径
        File file = new File("D:/happy.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
    }
}
