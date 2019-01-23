package com.company;

import java.util.Scanner;

/*
 * Take integer input from the user, output whether it's odd or even.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        promptUser();
    }
    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num1 = keyboard.nextInt();

        check(num1);
    }

    public static void check(int num1){
        if(num1%2==0){
            System.out.println(num1 +" is an Even Number");
        } else {
            System.out.println(num1 + " is an Odd Number");
        }
    }
}
