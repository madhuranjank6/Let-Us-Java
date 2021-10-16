/*
Question 5.
Write a program to check whether a triangle is valid or not, when three angles of the triangle are entered through the keyboard. A triangle is valid if the sum of all 
three angles is equal to 180 degrees.
*/

import java.util.Scanner;
class Question5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st angle of the triangle: ");
        int angle_1 = scan.nextInt();
        System.out.println("Enter the 2nd angle of the triangle: ");
        int angle_2 = scan.nextInt();
        System.out.println("Enter the 3rd angle of the triangle: ");
        int angle_3 = scan.nextInt();

        if(angle_1+angle_2+angle_3 == 180){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }

        scan.close();
    }
}
