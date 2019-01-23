package com.company;

import java.util.Scanner;

/*
 * Count all words in the sentence: The dog jumped over the fence (use String.split(" ") method).
 */
public class WordCount {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = keyboard.nextLine();

        int words = wordCount(str);
        System.out.println(words);
    }

    public static int wordCount(String str) {
        System.out.println(str);
        int count = 0;
        for (String word : str.split(" ")) {
            count++;
        }
        return count;
    }
}
