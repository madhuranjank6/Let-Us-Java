/**
Question 1.
If the cost price and selling price of an item is input through the keyboard, Write a java Program to determine whether the seller has made profit or incurred loss. 
Also determine how much profit he made or loss he incurred.
*/

import java.util.Scanner;

class Question1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost price of the Item: ");
        double cp = scan.nextDouble();
        System.out.println("Enter the selling price of the Item: ");
        double sp = scan.nextDouble();

        if(cp>sp){
            System.out.println("He has incurred loss of Rs. "+(cp-sp));
        }else{
            System.out.println("He has gained profit of Rs. "+(sp-cp));
        }

        scan.close(); //Optional
    }
}
