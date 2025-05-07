package com.loopsJava;

import java.util.Scanner;

public class Strings {
public static void main(String[] args) {
//	StringBuffer a = new StringBuffer("Credo");
//	String b ="credo";
//	System.out.println("reverse..."+a.reverse());
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your string");
	String c = sc.next();
	String r ="";
	for(int i=0; i<c.length();i++) {
	r=c.charAt(i)+r;
	}
	System.out.println(r);
	if(c.equals(r)) {
		System.out.println("its a palindrom");
	}else {
		System.out.println("its not a palindrom");
	}
	
}
}
