package com.company;

import java.util.Scanner;

/*
 * The letter grade is determined as follows:
 * A = 90–100%
 * B = 80–89%
 * C = 70–79%
 * D = 60–69%
 * F = 0–59%
 * Write a program that will print the letter grade based on the percentage entered.
 */
public class Grade {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter total : ");
        int n = keyboard.nextInt();

        System.out.print("Enter marks obtained : ");
        int m = keyboard.nextInt();

        char grade = getGrade(m, n);
        System.out.print(grade);
        System.out.printf("Student  Test Score %d and Grade %s"
                , n, grade);

    }

    public static char getGrade(int marks, int total) {
        char grade;
        double percent = marks * 100 / total;

        if ((percent >= 90) & (percent <= 100)) {
            grade = 'A';
        } else if ((percent >= 80) & (percent <= 89)) {
            grade = 'B';
        } else if ((percent >= 70) & (percent <= 79)) {
            grade = 'C';
        } else if ((percent >= 60) & (percent <= 69)) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

}
