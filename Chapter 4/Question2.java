/*
Question 2.
Any Integer is input through the keyboard. Write a java program to find out whether it is an odd number or even number.
*/

import java.util.Scanner;

class Question2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = scan.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is an Even number");
        }else{
            System.out.println(num+" is an odd number");
        }

        scan.close();
    }
}