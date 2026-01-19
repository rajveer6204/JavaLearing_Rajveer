package Basics01.Basics.Question;

import java.util.Scanner;
//write a java Program to Covert kilometers to meters .

public class question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter kilometer"+" " );
        double kilo = sc.nextDouble();
        System.out.println("Kilometer vlues : "+kilo);

        double meter = kilo*1000;
        System.out.println("Metets Values : "+meter);


    }
}
