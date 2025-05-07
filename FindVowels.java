package com.loopsJava;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String vowels = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels += ch;
            }
        }

        if (!vowels.isEmpty()) {
            System.out.println("Vowels found: " + vowels);
        } else {
            System.out.println("No vowels found.");
        }
    }
}