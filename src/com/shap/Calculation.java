package com.shap;
/**
 * @author 张攀华
 * 面积
 * 2019/3/10
 */
public class Calculation {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius=3;
        shape.area();
        shape = new Rectangle();
        shape.height=3;
        shape.width=3;
        shape.area();
    }
}
