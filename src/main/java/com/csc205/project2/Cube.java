package com.csc205.project2;

public class public abstract class Cube extends Shape {

    protected double width;

    public Cube(double width){
        this.width = width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double SurfaceArea(){
        return 6 * width * width;
    }

    public double volume(){
        return (width * 6 * width * width);
    }
    @Override
    public String toString() {
        return ("Sphere {Width = " + getWidth() + "surface area = " + SurfaceArea()) + "volume = " + volume();
    }
}

}
