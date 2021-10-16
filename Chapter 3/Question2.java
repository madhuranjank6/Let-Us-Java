
/**
Question 2.
If a five digit number is input through the Keyboard, Write a java Program to Calculate the sum of its digits.
*/

import java.util.Scanner;

class Question2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the five digit number: ");
        int num = scan.nextInt();
        int sum = 0;
        while(num != 0){
            int r = num%10;
            sum = sum + r;
            num = num/10;
        }

        System.out.println("The sum of digits of this number is = "+sum);
        scan.close();
    }
}