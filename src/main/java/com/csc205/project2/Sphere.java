package com.csc205.project2;

public class public abstract class Sphere extends Shape{

    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double SurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double Volume(){
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString(){
        return ("Sphere {Radius = " + radius + "surface area = " + SurfaceArea() + "volume = " + Volume());
    }
}
}
