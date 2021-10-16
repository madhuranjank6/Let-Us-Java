/**
Question 5.
A Cashier has currency notes of denominations 10,50 and 100. If the amount to be withdrawn is input through the keyboard, Write a java Program to find the minimun number of currency notes of each denominations the cashier will have to give to the withdrawer.
*/

import java.util.Scanner;

class Question5{
    public static void main(String agrs[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw in multiples of 10: ");
        int amount = scan.nextInt();
        int count_100 = 0;
        int count_50 = 0;
        int count_10 = 0;

        while(amount!=0){
            if(amount>=100){
                count_100 = count_100 + 1;
                amount = amount - 100;
            }else if(amount >= 50){
                count_50 = count_50 + 1;
                amount = amount - 50;	
            }else{
                count_10 = count_10 + 1;
                amount = amount - 10;
            }
        }

        System.out.println("Notes of denomination 100 = "+count_100);
        System.out.println("Notes of denomination 50= "+count_50);
        System.out.println("Notes of denomination 10 = "+count_10);

        scan.close(); //Optional
    }
}