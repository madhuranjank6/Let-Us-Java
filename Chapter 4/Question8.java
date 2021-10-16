/*
Question 8.
Given Length and Breadth of the Rectangle, Write a java Program to find whether the area of the rectangle is greater tham its perimeter.
*/
 
import java.util.Scanner;

class Question8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = scan.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = scan.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length + breadth);

        if(area > perimeter){
            System.out.println("Area is Greater");
        }else{
            System.out.println("Perimeter is Greater");
        }

        scan.close();
    }
}