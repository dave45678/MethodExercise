package com.company;

import java.util.Scanner;

/**
 * Write an application to divide 2 numbers. Prompt the user to enter two numbers. Take the first number and divide it
 * by the second number and print that result to the screen. If the second number is a zero, print "Undefined" to the
 * screen, otherwise just print the result.
 */
public class DivideNumbers {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = keyboard.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = keyboard.nextDouble();

        double result = divideTwoNumbers(num1, num2);
        System.out.println(result);
    }

    public static double divideTwoNumbers(double num1, double num2){
        double result = 0;
        if(num2 == 0){
            System.out.println("Undefined");
        } else {
             result = num1 / num2;
        }
        return result;
    }
}
