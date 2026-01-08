package Basics01.ConditionalStatement;

public class ConditionalStatement {
public static void main(String[] args){

/*
====================================================
        CONDITIONAL STATEMENTS - JAVA BASICS
====================================================

A conditional statement is used to make decisions
in a program based on conditions (true / false).

Types covered in this file:
1. if
2. if-else
3. else-if ladder
4. nested if
5. switch
*/

    // ------------------------------------------------
            // 1. IF STATEMENT
            // ------------------------------------------------
            int age = 20;

            if (age >= 18) {
                System.out.println("IF: You are eligible to vote");
            }

            // ------------------------------------------------
            // 2. IF - ELSE STATEMENT
            // ------------------------------------------------
            int number = 7;

            if (number % 2 == 0) {
                System.out.println("IF-ELSE: Even number");
            } else {
                System.out.println("IF-ELSE: Odd number");
            }

            // ------------------------------------------------
            // 3. ELSE-IF LADDER
            // ------------------------------------------------
            int marks = 75;

            if (marks >= 90) {
                System.out.println("ELSE-IF: Grade A");
            } else if (marks >= 60) {
                System.out.println("ELSE-IF: Grade B");
            } else {
                System.out.println("ELSE-IF: Grade C");
            }

            // ------------------------------------------------
            // 4. NESTED IF
            // ------------------------------------------------
            boolean hasID = true;

            if (age >= 18) {
                if (hasID) {
                    System.out.println("NESTED IF: You can enter");
                }
            }

            // ------------------------------------------------
            // 5. SWITCH STATEMENT
            // ------------------------------------------------
            int day = 3;

            switch (day) {
                case 1:
                    System.out.println("SWITCH: Monday");
                    break;
                case 2:
                    System.out.println("SWITCH: Tuesday");
                    break;
                case 3:
                    System.out.println("SWITCH: Wednesday");
                    break;
                default:
                    System.out.println("SWITCH: Invalid day");
            }

            // ------------------------------------------------
            // END OF PROGRAM
            // ------------------------------------------------
        }
    }
