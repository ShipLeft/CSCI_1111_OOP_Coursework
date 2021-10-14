package com.company;

import java.util.Scanner;

/**
 * <h1>Exercise 11-1</h1>
 *
 * <p>This class will test Triangle.java and GeometricObject.java</p>
 *
 * <p>Created: 10/14/2021</p>
 *
 * @author Rhett Boatright
 */
public class Main {

    //make public main class.

    /**
     * This method will create a new triangle object to test Triangle.java.
     *
     * @param args (String; placeholder for the main method.)
     */
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);//Import Scanner util.

        //Create new triangle object.
        Triangle triangle1 = new Triangle();

        //Prompt user to input sides of triangle.
        System.out.println("Enter the sides of the triangle separated by a space: ");
        triangle1.setSide1(user.nextDouble());
        triangle1.setSide2(user.nextDouble());
        triangle1.setSide3(user.nextDouble());

        //Prompt user to input the color of the triangle.
        System.out.println("Enter the color of the triangle: ");
        triangle1.setColor(user.next());

        //Prompt user to input filling of the triangle.
        System.out.println("Enter 'Yes' if the triangle is filled" +
                " or 'No' if it is not filled: ");
        String answer = user.next();
        if(answer.equalsIgnoreCase("yes")){
            triangle1.setFilled(true);
        }
        else if(answer.equalsIgnoreCase("no")){
            triangle1.setFilled(false);
        }

        //Return new triangle to user.
        System.out.println(triangle1.toString());
    }



}
