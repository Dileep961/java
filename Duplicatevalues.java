package com.loopsJava;

public class Duplicatevalues {

	public static void main(String[] args) {
//		int []a = {22,33,33,22,4,5,7,88,99,88,99};
//		for (int i=0;i<a.length-1;i++) {
//			for(int j =i+1;j<a.length;j++) {
//				if(a[i]==a[j]&&(i!=j)) {
//					System.out.println("the duplicate numbers is ..." +a[j]);
					
//					{a,a,b,b,e,e,r,r,t,t,y,u,i,o,p}
					
		
					char []a = {'a','a','b','b','e','e','r','r','t','t','y','u','i','o','p'};
					for (int i=0;i<a.length-1;i++) {
						for(int j =i+1;j<a.length;j++) {
							if(a[i]==a[j]&&(i!=j)) {
								System.out.println("the duplicate char is ..." +a[j]);
				}
			}
		}
	}
}
