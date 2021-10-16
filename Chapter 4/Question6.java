/*
Question 6.
If the three sides of the triangle is input through the keyboard, Write a program to check whether the triangle is valid or not. The triangle is valid if the sum of two sides 
is greater than the largest of the three sides.
*/

import java.util.Scanner;
class Question6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle: ");
        int side_1 = scan.nextInt();
        System.out.println("Enter the 2nd side of the triangle: ");
        int side_2 = scan.nextInt();
        System.out.println("Enter the 3rd side of the triangle: ");
        int side_3 = scan.nextInt();

        //Logic rto determine the largest side
        int largest = side_1;
        if(side_2 > side_1 && side_2 > side_3){
            largest = side_3;
        }else if(side_3 > side_1 && side_3 > side_2){
            largest = side_3;
        }

        //Logic to check whether a triangle is valid or not
        if(side_1 + side_2 > largest){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }

        scan.close();
    }
}
