package Basics01.Input.Question;

import java.util.*;
public class Question01 {
public static void main(String []args ){

//    Q1. Take 2 variable 'a' and 'b' Print their SUM

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a : ");
    int a = sc.nextInt();
    System.out.print("Enter b : ");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Value is : "+ sum);
}
}
