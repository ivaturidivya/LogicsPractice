package com.revoquest;

public class WordsInString {
    public static void main(String[] args) {
        String s = "HOW Are You";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                counter++;
            }

        }
        System.out.println("No of words in a given string is " + (counter + 1));

        String s2 = "Who Are You";
        String[] wordsArray = s2.split(" ");
        System.out.println("Now of words in s2 is " + wordsArray.length);
        for (String word : wordsArray) {
            System.out.println(word);
        }


    }
}
