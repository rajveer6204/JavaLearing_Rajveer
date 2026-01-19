package Basics01.Basics.Question;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Subject Marks ");

        System.out.print(" Maths Marks ");
        int Math = sc.nextInt();
        System.out.print(" Hindi Marks ");
        int Hindi = sc.nextInt();
        System.out.print(" Science Marks ");
        int Science = sc.nextInt();
        System.out.print(" English Marks ");
        int English = sc.nextInt();
        System.out.print(" Computer Marks ");
        int Computer = sc.nextInt();
        float Percenteg =((Math + Hindi+ Science + English+ Computer )/500.0f*100);
        System.out.print("Your Percenteg % : ");
        System.out.print(Percenteg + " ");
    }
}
