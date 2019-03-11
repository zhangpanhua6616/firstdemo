package com.drawSpecialPrarllelogram;

import java.awt.*;

/**
 * @author 张攀华
 * 平行四边形
 * 2019/3/10
 */
public class SpecialPrarllelogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        for (int i = 0;i < images.length;i++){
            images[i].draw();
        }
    }
}
