package Basics01.ConditionalStatement.IfStatement;
import java.util.*;
public class Calculater {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

//    int num1,num2;
    char operator ;
    double result =0;

    System.out.println("Choose AnyOne : (+,-,/,*,% )");
    operator=sc.next().charAt(0);
    System.out.println("Enter value num1 : ");
    int num1 = sc.nextInt();
    System.out.println("Enter value num2 : ");
    int num2 = sc.nextInt();


 switch (operator){

     case '+':
         result=num1+num2;
         break;
     case '-':
         result=num1-num2;
         break;

     case '*':
         result=num1*num2;
         break;

     case '/':if (num2!=0){
         result=(double) num1/num2;
     }else {
         System.out.print("Error : Divison by Zero is not Allowed. ");
         return;
     }
         break;

     case '%':
         result=num1%num2;
         break;

     default:
         System.out.println("Invalid !! ");
 }
    System.out.println("Result is : " + result);
}
}
