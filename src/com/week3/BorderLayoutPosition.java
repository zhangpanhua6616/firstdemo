package com.week3;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout边界布局管理器
 * @author 张攀华
 * 2019.3.26
 */
public class BorderLayoutPosition extends JFrame {
    public BorderLayoutPosition(){
        setTitle("这个窗体使用边界布局管理器");
        //定义一个容器
        Container container = getContentPane();
        //设置容器为边界布局管理器
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中神通"),
        northBtn = new JButton("北丐"),
        southBtn = new JButton("南帝"),
        westBtn = new JButton("西毒"),
        eastBtn = new JButton("东邪");
        container.add(centerBtn,BorderLayout.CENTER);
        container.add(northBtn,BorderLayout.NORTH);
        container.add(southBtn,BorderLayout.SOUTH);
        container.add(westBtn,BorderLayout.WEST);
        container.add(eastBtn,BorderLayout.EAST);
        //设置窗体大小
        setSize(350,200);
        //设置窗体可见
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
