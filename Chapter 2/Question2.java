
/*
Question 2.
Assume a suitable value for distance between two cities(in km). Write a java program to convert and print this distance in meteres, feet, inches and centimeters.
*/

import java.util.Scanner;
class Question2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the distance in KM: ");
        double km = scan.nextDouble();
        double m = km*1000;
        double feet = m * 3.28084;
        double inch = feet * 12;
        double cm = m * 100;

        System.out.println("Distance in KM: "+km);
        System.out.println("Distance in metres: "+m);
        System.out.println("Distance in feet: "+feet);
        System.out.println("Distance in inches: "+inch);
        System.out.println("Distance in centimeteres: "+cm);

        scan.close(); //This is completely optional
    }
}