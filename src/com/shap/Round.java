package com.shap;

public class Round extends Shape{
    @Override
    public void area() {
        System.out.println("圆形的面积是："+radius*radius*3.14);
    }
}
