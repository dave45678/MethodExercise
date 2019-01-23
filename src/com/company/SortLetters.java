package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Get 5 letters from the user, output them sorted (Hint: Use ArrayList and Collections.sort())
 */
public class SortLetters {
    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser(){
        Scanner keyboard = new Scanner(System.in);
        List<Character> letters = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.print("Enter "+ i +" letter: ");
            letters.add(keyboard.next().charAt(0));
        }
        sort(letters);
        System.out.println(letters);

    }
    public static void sort(List letters){
//        List<Character> newLetters = new ArrayList<>();
//        newLetters.add('a');
//        newLetters.add('m');
//        newLetters.add('i');
//        newLetters.add('r');
//        newLetters.add('h');
//        letters = newLetters;
        Collections.sort(letters);
    }
}