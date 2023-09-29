package com.csc205.project2;

public class public abstract class triangle extends Shape {

    protected double height, base, Area;

    public triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double Area(){
        return 0.5 * base * height;
    }
    @Override
    public String toString() {
        return ("Sphere {Height = " + height + "Area = " + Area + "base = " + base);
    }
}


