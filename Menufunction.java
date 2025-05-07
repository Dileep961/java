package com.loopsJava;

import java.util.Scanner;

public class Menufunction {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		 menu();
 
	}
 
	public static void menu() {
 
		System.out.println("enter your choice here \n1.ADD\n2.Subtraction\n3.Multiple\n4.Divide\n5.Exit");
 
	
		int choice = sc.nextInt();
		if (choice == 1) {
			add();
			menu();
 
		} else if (choice == 2) {
 
			sub(10, 5);
			menu();
 
		} else if (choice == 3) {
 
			int c = mul();
			System.out.println("the multiplication is......" + c);
			menu();
 
		} else if (choice == 4) {
 
			double d = div(10, 2);
			System.out.println("the division is...." + d);
			menu();
 
		} else {
 
			System.out.println("Thanks for using application ");
 
		}
 
	}
 
	public static void add() {
 
		System.out.println("Enter your first num");
		int a = sc.nextInt();
		System.out.println("Enter your second num");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("the addition ans is........... " + c);
	}
 
	public static void sub(int a, int b) {
 
 
		System.out.println("Enter your first num");
		a = sc.nextInt();
		System.out.println("Enter your second num");
		b = sc.nextInt();
		int c = a - b;
 
		System.out.println("the subraction ans is........... " + c);
 
	}
 
	public static int mul() {
 
 
		System.out.println("enter your a num");
		int a = sc.nextInt();
		System.out.println("enter your b num");
		int b = sc.nextInt();
		return a * b;
 
	}
 
	public static double div(int a, int b) {
 
		return a / b;
 
	}
 
}
