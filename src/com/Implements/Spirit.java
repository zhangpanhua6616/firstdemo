package com.Implements;
/**
 * @author 张攀华
 * 接口
 * 2019/3/10
 */
public class Spirit implements Sing,Move {
    @Override
    public void move() {
        System.out.println("可移动");
    }

    @Override
    public void sing() {
        System.out.println("可唱歌");
    }

    public static void main(String[] args) {
        Spirit spirit = new Spirit();
        System.out.println("精灵");
        spirit.move();
        spirit.sing();
    }
}
