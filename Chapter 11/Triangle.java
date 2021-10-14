package com.company;



//Create extending subclass Triangle for GeometricObject.

/**
 * <h1>Triangle</h1>
 *
 * <p>This class will construct a triangle using GeometricObject.java</p>
 *
 * <p>Created: 11/14/2021</p>
 *
 * @author Rhett Boatright
 */
public class Triangle extends GeometricObject{

    //Data fields for Triangle.
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //No-arg constructor.
    public Triangle(){

    }

    //Specified constructor.
    public Triangle(
            double side1, double side2, double side3, String color, boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    //Method to return side1.
    public double getSide1(){
        return side1;
    }

    //Method to set a new length for side1.
    public void setSide1(double side1){
        this.side1 = side1;
    }

    //Method to return side2.
    public double getSide2(){
        return side2;
    }

    //Method to set a new length for side2.
    public void setSide2(double side2){
        this.side2 = side2;
    }

    //Method to return side3.
    public double getSide3(){
        return side3;
    }

    //Method to set a new length for side3.
    public void setSide3(double side3){
        this.side3 = side3;
    }
    //Method to get the area of the triangle.
    public double getArea(){
        double s = ((side1 + side2 + side3) / 2);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //Method to get the perimeter of the triangle.
    public double getPerimeter(){
        return ((side1 + side2 + side3) / 2);
    }

    //Method to print the new triangle in a string.
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3
                + "\n Triangle area: " + getArea() + " Triangle perimeter: " + getPerimeter()
                + "\n"+ getString();
    }
}
