package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Given the array list, print a random word from the list: (module, class, implement).

 */
public class RandomWord {
    public static void main(String[] args) {
        promptUser();
    }
    public static void promptUser() {
        Scanner keyboard = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("module");
        list.add("class");
        list.add("implement");

        String word = getRandomWord(list);
        System.out.println(word);
    }

    public static String getRandomWord(List list) {
        int randomIndex = (int) (Math.random() * list.size());
        String word = list.get(randomIndex).toString();
        return word;
    }
}
