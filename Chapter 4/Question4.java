/*
Question 4.
If the ages of Ram, Shyam and Ajay are input through the keyboard, Write a java program to determine the youngest of Three.
*/

import java.util.Scanner;

class Question4{
    public static void main(String agrs[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age of Ram: ");
        int ram_age = scan.nextInt();
        System.out.println("Enter the age of Shayam: ");
        int shyam_age = scan.nextInt();
        System.out.println("Enter the age of Ajay: ");
        int ajay_age = scan.nextInt();

        if(ram_age < shyam_age && ram_age < ajay_age){
            System.out.println("Ram is Younger");
        }else if(shyam_age < ram_age && shyam_age < ajay_age){
            System.out.println("Shyam is younger");
        }else{
            System.out.println("Ajay is younger");
        }
        scan.close();
    }
}