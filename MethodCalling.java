package com.loopsJava;

import java.util.Scanner;

public class MethodCalling {

	public static void main(String[] args) {
	add();	
	int c = sub();	
	System.out.println("the subtraction is ....." +c);
//	multiply(c, c);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first num");
	int a = sc.nextInt();
	System.out.println("Enter your second num");
	int b = sc.nextInt();
	multiply(a ,b);
	}
		
		public static void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first num");
		int a = sc.nextInt();
		System.out.println("Enter your second num");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("the addition is ....." +c);
	}

			public static int sub() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your first num");
				int a = sc.nextInt();
				System.out.println("Enter your second num");
				int b = sc.nextInt();
//				int c = a-b;
//				System.out.println("the subtraction is ....." +c);
				return a-b;
			}
			public static void multiply(int a, int b) {
				System.out.println(a*b);

			}
}
