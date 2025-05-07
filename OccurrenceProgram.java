package com.loopsJava;

public class OccurrenceProgram {

	public static void main(String[] args) {
		
	
		int []a = {22,33,33,22,4,5,7,88,99,88,99};
		int count=1;
		for (int i=0;i<a.length-1;i++) {
			count=1;
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]&&(a[i]!=-1)) {
					count++;
					a[j]=-1;
//					System.out.println("the duplicate numbers is ..." +a[j]);

	}
			}
		if(a[i]!=-1) {{
		}
		System.out.println(a[i]+"the occurance count is   :"+count);
		}}}}		
