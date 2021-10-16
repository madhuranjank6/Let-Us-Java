
/**
Question 1.
Two numbers are the input from the keyboard into two different locations C and D. Write a java Program to interchange the contents of C and D.
*/

import java.util.Scanner;
class Question1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to store at location C: ");
        int c = scan.nextInt();
        System.out.println("Enter the number to store at location D: ");
        int d = scan.nextInt();

        System.out.println("Initially....");
        System.out.println("C = "+c);
        System.out.println("D = "+d);

        //Logic for interchanging the contents of C and D 
        int temp = c;
        c = d;
        d = temp;

        System.out.println("After Interchanging the Value...");
        System.out.println("C = "+c);
        System.out.println("D = "+d);

        scan.close(); //Optional
    }
}