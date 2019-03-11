package com.shap;

public class Rectangle extends Shape{
    @Override
    public void area() {
        System.out.println("矩形的面积是："+height*width);
    }
}
