package Basics01.varibales;

public class Varibales {
public static void main(String[] args){

    //    1️⃣ What is a Variable?

//A variable is like a container in your computer’s memory that stores data.
//Think of it like a box where you can put a value (number, text, true/false, etc.).
//You can change the value inside the box anytime (except for constants).

//    2️⃣ Why Do We Need Variables?
//To store data temporarily while the program runs.
//To perform calculations or manipulate values.
//To make programs dynamic, instead of using fixed values.

//    dataType variableName = value;

    // 1. byte (stores small whole numbers)
    byte myByte = 100;
    System.out.println("byte value: " + myByte);

    // 2. short (stores larger whole numbers than byte)
    short myShort = 32000;
    System.out.println("short value: " + myShort);

    // 3. int (most commonly used integer type)
    int myInt = 100000;
    System.out.println("int value: " + myInt);

    // 4. long (very large whole numbers)
    long myLong = 10000000000L;
    System.out.println("long value: " + myLong);

    // 5. float (decimal numbers - single precision)
    float myFloat = 5.5f;
    System.out.println("float value: " + myFloat);

    // 6. double (decimal numbers - double precision)
    double myDouble = 99.99;
    System.out.println("double value: " + myDouble);

    // 7. char (single character)
    char myChar = 'A';
    System.out.println("char value: " + myChar);

    // 8. boolean (true or false)
    boolean isJavaFun = true;
    System.out.println("boolean value: " + isJavaFun);
}
}
