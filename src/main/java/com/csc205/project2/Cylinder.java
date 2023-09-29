package com.csc205.project2;

public class public abstract class Cylinder extends Shape {
    protected double height, radius;

    public Cylinder(double height, double radius){
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getHeight(){
        return this.height;
    }

    public double SurfaceArea(){
        double Area = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * Area * lateralArea;
    }

    public double Volume(){
        return Math.PI * radius * radius * height;
    }
    public String toString() {
        return ("Sphere {Height = " + height + "radius = " + radius + "surface area = " + SurfaceArea()) + "volume = " + volume();
    }
}

}
