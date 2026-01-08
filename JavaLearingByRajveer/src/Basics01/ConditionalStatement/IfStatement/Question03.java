package Basics01.ConditionalStatement.IfStatement;
import java.util.*;
public class Question03 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter num01: ");
    int num01 = sc.nextInt();
    System.out.print("Enter num02: ");
    int num02 = sc.nextInt();

    if (num01==num02)
    {
        System.out.print("Equal");
    }
    else if (num01>=num02)
    {
        System.out.print("num01 is Greater");
    }
    else
    {
        System.out.print("num01 is Lesser");
    }
}
}
