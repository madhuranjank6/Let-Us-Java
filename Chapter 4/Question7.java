/*
Question 7.
If three sides of triangle are entered through the keyboard, Write a program to check whether the triangle is isosceles, equilateral, scalene or right angled triangle.
*/

import java.util.Scanner;
class Question7{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st side of Triangle: ");
        int a = scan.nextInt();
        System.out.println("Enter the 2nd side of the Triangle: ");
        int b = scan.nextInt();
        System.out.println("Enter the 3rd side of the Triangle: ");
        int c = scan.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else if(a==b || b == c || a==c){
            System.out.println("Isosceles Triangle");
        }else if(a*a == (b*b + c*c) || b*b == (c*c + a*a) || c*c == (b*b + a*a)){
            System.out.println("Right Angled Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }

        scan.close();
    }
}
