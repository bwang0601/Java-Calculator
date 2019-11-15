package com.calculator.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter first and second number:");
        Scanner sca= new Scanner(System.in);
        int firstNumber,secondNumber;
        firstNumber = sca.nextInt();
        secondNumber = sca.nextInt();
        System.out.println("Enter your selection: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 5 for to the power of:");
        int choose;
        choose = sca.nextInt();
        switch (choose){
            case 1:
                System.out.println(add(firstNumber,secondNumber));
                break;
            case 2:
                System.out.println(sub(firstNumber,secondNumber));
                break;
            case 3:
                System.out.println(mult(firstNumber,secondNumber));
                break;
            case 4:
                System.out.println(div(firstNumber,secondNumber));
                break;
            case 5:
                System.out.println(power(firstNumber,secondNumber));
            default:
                System.out.println("Illigal Operation");


        }
    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    public static double power(int x, int y)
    {
        double xd = x;
        double yd = y;
        double result = Math.pow(xd, yd);
        return result;
    }

}
