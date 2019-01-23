package com.company;

import java.util.Scanner;

/*
 * Print a 5 random numbers given a bound.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter highest number : ");
        int n = keyboard.nextInt();

        for (int i = 0; i < 5; i++) {
            int num = bound(n);
            System.out.print(num + ", ");
        }
    }

    public static int bound(int b) {
        int randomNum = 1 + (int) (Math.random() * b);
        return randomNum;
    }
}
