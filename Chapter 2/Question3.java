
/*
Question 3.
Assume the suitable values for the marks obtained by a student in five subjects are input through the keyboard. Write a java program to find out the aggregate marks and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.
*/

import java.util.Scanner;
class Question3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks in Subject 1: ");
        int m1 = scan.nextInt();
        System.out.println("Enter the marks in Subject 2: ");
        int m2 = scan.nextInt();
        System.out.println("Enter the marks in Subject 3: ");
        int m3 = scan.nextInt();
        System.out.println("Enter the marks in Subject 4: ");
        int m4 = scan.nextInt();
        System.out.println("Enter the marks in Subject 5: ");
        int m5 = scan.nextInt();

        int agg = m1+m2+m3+m4+m5;
        double per = (agg/500.0)*100;

        System.out.println("Aggregate Marks = "+agg);
        System.out.println("Percentage of marks = "+per+"%");

        scan.close(); //Optional
    }
}