package com.loopsJava;

public class Alphapyramid {
public static void main(String[] args) {
	int i, j;
	for (i = 0; i < 6; i++) {
		for (j = 6 - i; j > 1; j--) {
			System.out.print(" ");
		}
		for (j = 0; j <= i; j++) {

			System.out.print((char)(64+j));
		}
		System.out.println();
	}
}
}
