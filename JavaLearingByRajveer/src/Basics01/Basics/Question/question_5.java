// package Basics01.Basics.Question;
// Write a java Program to detect whether a number Enter by the user is integer or not .
import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt()); //we are using sc.hasNextInt there for the output is coming true or false .
    }
}

