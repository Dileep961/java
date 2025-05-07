package com.loopsJava;

import java.util.HashMap;
import java.util.Map;

public class DuplicateLetters {

	public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
	}
}
