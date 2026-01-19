// package Basics01.Basics.Question;


import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        write a program to calculate (CGPA Using marks of three subject Out of 100 ).

//        int subject_1 =50;
//        int subject_2 =95;
//        int subject_3 =64;
        System.out.println("Enter your  Marks ");
        System.out.print("Enter English : ");
        int subject_1 = sc.nextInt();
        System.out.print("Enter Maths  : ");
        int subject_2 = sc.nextInt();
        System.out.print("Enter Science : ");
        int subject_3 = sc.nextInt();

        int Total =subject_1 + subject_2+ subject_3;
        double percentage =Total/3.0;
        double CGPA = percentage/10.0;

        System.out.println("Your Marks out of 300 : "+ Total);
        System.out.println("percentage  out of 100 % : "+ percentage);
        System.out.println("CGPA out of 10  : "+ CGPA);
    }
}
