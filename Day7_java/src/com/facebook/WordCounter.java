package com.facebook;

public class WordCounter {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words.";

        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String input) {
        
        input = input.trim();
        
        if (input.isEmpty()) {
            
            return 0;
        } else {
    
            String[] words = input.split("\\s+");
            return words.length;
        }
    }
}

