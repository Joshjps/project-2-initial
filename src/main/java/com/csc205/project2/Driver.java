package com.csc205.project2;

public class public static void main(String[] args) {

        triangle Triangle = new triangle(6, 20) {
@Override
public double surfaceArea() {
        return 0;
        }

@Override
public double volume() {
        return 0;
        }

@Override
public String Shape() {
        return null;
        }
        };
        Cube cube = new Cube(5.0) {
@Override
public double surfaceArea() {
        return 0;
        }

@Override
public String Shape() {
        return null;
        }
        };

        Sphere sphere = new Sphere(2.0) {
@Override
public double surfaceArea() {
        return 0;
        }

@Override
public double volume() {
        return 0;
        }

@Override
public String Shape() {
        return null;
        }
        };

        Cylinder cylinder = new Cylinder(4.0 , 1.0) {
@Override
public double surfaceArea() {
        return 0;
        }

@Override
public double volume() {
        return 0;
        }

@Override
public String Shape() {
        return null;
        }
        };

        System.out.println("Sphere " + sphere.toString());
        System.out.println("Cube " + cube.toString());
        System.out.println("Cylinder " + cylinder.toString());
        System.out.println("Triangle " + Triangle.toString());


        }
        }
