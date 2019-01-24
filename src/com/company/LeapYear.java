package com.company;

import java.util.Scanner;

/*
 * Check if a year is a leap year (A leap year is divisible by 4).

 */
public class LeapYear {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = keyboard.nextInt();

        if(isLeapYear(year)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year!!!");
        }
    }

    public static boolean isLeapYear(int year){
        if(year%4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
