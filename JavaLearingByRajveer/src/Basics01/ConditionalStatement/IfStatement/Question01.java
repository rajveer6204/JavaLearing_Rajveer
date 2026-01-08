package Basics01.ConditionalStatement.IfStatement;
import java.util.*;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        System.out.print("Enter your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.print("you are eligible for vote ");
        } else {
            System.out.println("you are NOT eligible  for vote ");
        }
    }
}