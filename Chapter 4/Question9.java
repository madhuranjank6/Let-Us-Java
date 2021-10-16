/*
Question 9.
Given the coordinates (x,y) of center of the circle and its radius. Write a java Program which will determine whether a point lies inside the circle, on the circle or 
outside the circle. (Hint: use Math.sqrt() and Math.pow() functions.)
*/

import java.lang.*;
import java.util.Scanner;

class Question9{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of the center of the circle: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextDouble();

        System.out.println("Enter the co-ordinates of the point: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        //Calculating the distance between center and the point
        double distance = Math.sqrt(Math.pow((x-x1),2)+Math.pow((y-y1),2));

        if(distance > r){
            System.out.println("Point lies Outside the circle");
        }else if(distance < r){
            System.out.println("Point lies insisde the circle");
        }else{
            System.out.println("Point lies on the circle");
        }
    }
}
