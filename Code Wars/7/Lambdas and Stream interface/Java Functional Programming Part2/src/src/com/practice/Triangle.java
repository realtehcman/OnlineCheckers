package com.practice;

public class Triangle {
    public final int height;
    public final int base;

    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    private double area;
    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }
}