
/*
Question 3.
If a five digit number id input through keyboard, Write a java Program to reverse the number.
*/

import java.util.Scanner;

class Question3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Five digit number: ");
        int num = scan.nextInt();
        int rev = 0;
        while(num != 0){
            int r = num%10;
            rev = rev*10 + r;
            num = num/10;
        }

        System.out.println("The reverse of this number is: "+rev);
        scan.close();
    }
}