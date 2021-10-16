/*
Question 10.
Given a point (x,y), Write a java program to find out if it lies on the x-axis, y-axis or on the origin, viz.(0,0).
*/

import java.util.Scanner;

class Question10{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of the point: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        // At origin, x = 0 , y = 0
        if(x == 0 && y == 0){
            System.out.println("Point lies on the origin");
        }else if(x==0){
            // On y-axis the value of x is 0
            System.out.println("The Point lies on y-axis");
        }else if(y == 0){
            // On x-axis the value of y is 0
            System.out.println("Point lies on x-axis");
        }else{
            System.out.println("Point does not lies on x-axis, y-axis or at origin");
        }

        scan.close();
    }
}