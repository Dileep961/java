package com.loopsJava;

public class Alaphabet {
	public static void main(String[] args) {
		int rows = 5; // Number of rows in the pattern
		char letter;

		for (int i = 1; i <= rows; i++) {
			letter = 'A'; // Start with 'A' for each row
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(letter);
				letter++;
			}
			System.out.println();
		}
	}

}
