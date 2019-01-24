package com.company;

import java.util.Scanner;

/*
 * Get the average of 3 numbers.
 */

public class Average {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = keyboard.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = keyboard.nextInt();

        double average = getAverage(num1, num2, num3);
        System.out.println(average);
    }

    public static double getAverage(int... num){ //1, int num2, int num3){
        int sum =0;
        int i ;
        for (i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double average = sum/3;
        return average;
    }
}
