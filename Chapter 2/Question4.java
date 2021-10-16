
/**
Question 4.
Assume a suitable value for temperature of a city in Farenheit degrees. Write a java Program to convert this temperature into centigrade degrees and print both temperatures.
*/

import java.util.Scanner;

class Question4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature of the city in Farenheit degrees: ");
        double F = scan.nextDouble();

        double C = (F-32)*(5.0/9);

        System.out.println("Temperature in farenheit degrees = "+F);
        System.out.println("Temperature in degrees Celsius = "+C);

        scan.close(); //Optional
    }
}