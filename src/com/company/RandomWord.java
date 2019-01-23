package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given the array list, print a random word from the list: (module, class, implement).
 * Take integer input from the user, output whether it's odd or even.
 * The letter grade is determined as follows:
 * A = 90–100%
 * B = 80–89%
 * C = 70–79%
 * D = 60–69%
 * F = 0–59%
 * Write a program that will print the letter grade based on the percentage entered.
 */
public class RandomWord {
    public static void main(String[] args) {
        promptUser();
    }
    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);
        List<String> list = new ArrayList<>();

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
