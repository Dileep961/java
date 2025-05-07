package com.loopsJava;

public class Arrayexam {

	public static void main(String[] args) {
//		int [] a = new int[10];
//		int [] b = new int[10];
//		int [] c = new int[10];
//		
//		a[0] = 10;
//		b[0] = 10;
//		c[0] = (int)(a[0]+b[0]);
//		System.out.println(c[0]);
		
//		int a[] = {45,52,84,24,65,42};
//		int largest = 0;
//		for (int i = 0; i<a.length;i++) {
//			if(a[i]>largest) largest= a[i];
//		}
//		
//		
//		System.out.println(largest);
		int a[] = {45,52,84,24,65,42};
		int smallest = a[0];
		for (int i : a) {
			if(i>smallest) smallest= i;
		}
		
		
		System.out.println(smallest);
		
	}

}
