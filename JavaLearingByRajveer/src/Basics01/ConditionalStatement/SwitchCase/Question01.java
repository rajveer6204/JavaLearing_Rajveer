package Basics01.ConditionalStatement.SwitchCase;
//import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class Question01{
    public static void main(String[] args) {

        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Button :");
        int button = Sc.nextInt();
        switch (button){
            case 1:
                System.out.println("HEllo");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}

