package com.drawSpecialPrarllelogram;

interface DrawImage {
     public void draw();
}
class Rectangle implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
class Square implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画菱形");
    }
}

