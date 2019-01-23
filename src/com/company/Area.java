package com.company;

import java.util.Scanner;

/*
 * Take two integer inputs from the user, compute its area.
 */
public class Area {
    public static void main(String[] args) {
        promptUser();;
    }
    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = keyboard.nextInt();

        int area = calculateArea(num1, num2);
        System.out.println(area);
    }

    public static int calculateArea(int num1, int num2){
        int area = 0;
        area = num1 * num2;
        return area;
    }

}
