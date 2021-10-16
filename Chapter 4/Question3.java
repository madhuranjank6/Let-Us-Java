/*
Question 3.
Write a program to find the Absolute value of number that is entered through the keyboard.
*/

import java.util.Scanner;

class Question3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find the absolute value of: ");
        int num = scan.nextInt();
        if(num<0){
            System.out.println("The absolute value of "+num+" is = "+(-1*num));
        }else{
            System.out.println("The absolute value of "+num+" is = "+num);
        }
        scan.close();
    }
}