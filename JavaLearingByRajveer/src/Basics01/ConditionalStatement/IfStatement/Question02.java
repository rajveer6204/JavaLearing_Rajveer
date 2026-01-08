package Basics01.ConditionalStatement.IfStatement;
import java.util.*;
// Q check  ODD and EVEN

public class Question02 {
    public static void main(String []args ){

        System.out.print("Enter value : ");

        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0 )
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
    }
}
