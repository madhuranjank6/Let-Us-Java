/*
Question 5.
Assume suitable values for length and bradth of a rectangle, and radius of a circle. Write a java Program to calculate the area and perimeter of the rectangle, 
and the area and the Circumference of the circle.
*/

import java.lang.*;
import java.util.Scanner;

class Question5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scan.nextDouble();
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        System.out.println("Perimeter of Rectangle = "+2*(length+breadth));
        System.out.println("Area of Rectangle = "+(length*breadth));

        System.out.println("Circumference of Circle = "+(2*Math.PI*radius));
        System.out.println("Area of Circle = "+(Math.PI*radius*radius));

        scan.close(); //Optional
    }
}
