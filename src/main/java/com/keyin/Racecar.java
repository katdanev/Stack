package com.keyin;

import java.util.Stack;

public class Racecar {

    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        // STEPS
        // 1. Turn word  in lower case and remove a spaces
       word = word.toLowerCase().replaceAll("\\s", "");


        // 2. Add all characters to the stack using loop and push
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // 3. Build word in the reverse way using POP
        StringBuilder reversedWord = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            reversedWord.append(stack.pop());
        }

        // 4. Check if the word is a palindrome or not
        return word.equals(reversedWord.toString());
    }

    public static void main(String[] args) {
        String word = "Race car";
        if (isPalindrome(word)) {
            System.out.println(word + "  - your word is a palindrome.");
        } else {
            System.out.println(word + "  - your word is not a palindrome.");
        }
    }
}
