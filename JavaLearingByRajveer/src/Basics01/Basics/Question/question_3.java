// package Basics01.Basics.Question;

//        write a java program which asks the user to Enter his/her name and grat them with " Hello <name>, have a good day " text.

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        System.out.print("Enter your Name " + " ");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
//        System.out.println(name);
        System.out.println("Hello "+ name+" Have a good day");

    }
}
