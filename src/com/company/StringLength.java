package com.company;

import java.util.Scanner;

/*
 * Get the length of a string.
 */
public class StringLength {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = keyboard.nextLine();

        int length = getLength(str);
        System.out.println(length);
    }

    public static int getLength(String str){
        return str.length();
    }
}
