package com.week3;

import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GridLayout网格布局示例
 * @author 张攀华
 * 2019.3.27
 */
public class GridLayoutTest extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;
    private JLabel imgLabel;
    private Icon icon;
    private JRadioButton radioButton;
    private JTextArea jt;


    private GridLayoutTest(){
        init();
        setTitle("GridLayout网格布局管理器");
        //页面启动最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        //将整个容器背景设置为白色
        getContentPane().setBackground(new Color(255,255,255));
        //定义三行三列九宫格，放置9个面板
        GridLayout gridLayout = new GridLayout(3,3,50,30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板对象
        for (int i = 0;i < 9;i++){
            panels[i] = new JPanel();
            //面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板"+(i+1)));
            //面板依次加入网格布局管理器，变成九宫格
            add(panels[i]);
        }
        //设置第一个面板背景色，其布局方式默认为FlowLayout居中对齐
        panels[0].setBackground(new Color(255,160,122));
        //在第一个面板内部加入5个按钮
        for (int i = 0;i < 5;i++){
            panels[0].add(new JButton("java"));
        }
        //设置第二个面板为BorderLayout边界布局，设置背景色
        panels[1].setLayout(new BorderLayout(20,20));
        panels[1].setBackground(new Color(220,20,60));
        //5个方向加入按钮
        panels[1].add(new JButton("北"),BorderLayout.NORTH);
        panels[1].add(new JButton("南"),BorderLayout.SOUTH);
        panels[1].add(new JButton("东"),BorderLayout.EAST);
        panels[1].add(new JButton("西"),BorderLayout.WEST);
        panels[1].add(new JButton("中"),BorderLayout.CENTER);
        //设置第三个面板为GridLayout网格布局，设置背景色
        panels[2].setLayout(new GridLayout(3,3,10,10));
        panels[2].setBackground(new Color(255,99,71));
        //依次加入9个按钮
        for (int i =0;i < 9;i++){
            panels[2].add(new JButton(String.valueOf(i+1)));
        }
        //设置第四个面板为BorderLayout边界布局，设置背景色
        panels[3].setLayout(new BorderLayout(20,20));
        panels[3].setBackground(new Color(250,250,210));
        imgLabel = new JLabel();
        File srcFile = new File("D:/2.png");
        InputStream inputStream;
        byte[] bytes = null;
        try {
            inputStream = new FileInputStream(srcFile);
            bytes= new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
         icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        panels[3].add(imgLabel,BorderLayout.CENTER);
        //放入图片路径
        String pathName = srcFile.getAbsolutePath();
        JLabel path = new JLabel("图片路径："+pathName);
        panels[3].add(path,BorderLayout.WEST);
        //设置第五个面板为FlowLayout
        panels[4].setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panels[4].setBackground(new Color(255,215,0));
        panels[4].add(new JLabel("好好学Java"));
        //设置第六个面板为BorderLayout
        panels[5].setBackground(new Color(255,255,0));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        JLabel time = new JLabel("当前时间："+simpleDateFormat.format(date));
        panels[5].add(time,BorderLayout.SOUTH);
        //设置第七个面板为GirdLayout
        panels[6].setLayout(new GridLayout(3,3,10,10));
        panels[6].setBackground(new Color(127,255,212));
        String[] strings = {"A","B","C"};
        for (int i = 0;i<3;i++){
            radioButton = new JRadioButton(strings[i]);
            panels[6].add(radioButton);
        }
        //设置第八个面板为FlowLayout,加入文本域组件
        panels[7].setBackground(new Color(0,250,154));
        jt = new JTextArea("hello java",50,50);
        //可自动换行
        jt.setLineWrap(true);
        panels[7].add(jt);
        //设置第八个面板
        panels[8].setBackground(new Color(152,251,152));

    }


    public static void main(String[] args) {
        //用系统样式替代Swing默认样式，会好看点
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}
