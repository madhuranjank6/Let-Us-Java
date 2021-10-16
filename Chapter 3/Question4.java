/*
Question 4.
In a town, the percentage of men is 52. The percentage of total literacy is 48. If the total percentage of literate man is 35 of total population, Write a java program to find the
total number of literate men and women if the total population of the town is 80,000.
*/

class Question4{
    public static void main(String args[]){
        // int total_literacy = 48;
        // int literate_men = 35;
        // int per_men = 52;
        int total_population = 80000;

        int total_men = (int)(0.52*total_population);
        int total_literate = (int)(0.48*total_population);
        int num_of_literate_men = (int)(0.35*total_population);
        int num_of_literate_women = total_literate - num_of_literate_men;      

        System.out.println("Total Literate Population = "+total_literate);
        System.out.println("Total literate Men = "+num_of_literate_men);
        System.out.println("Total Literate Women = "+num_of_literate_women);
    }
}
