
/*
Question 1.
Assume a suitable value for Ramesh's basic salary. His dearness allowance is 40% of the basic salary, and house rent allowance is 20% of basic salary. 
Write a java Program to calculate his gross salary.
*/


import java.lang.*;
import java.util.Scanner;
class Question1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the basic Salary of Ramesh: ");
        double salary = scan.nextDouble();
        double da = 0.4*salary;
        double ha = 0.2*salary;

        double gross = salary+da+ha;
        System.out.println("Gross salary of Ramesh = "+gross);
        scan.close(); //This is completely optional
    }
}
