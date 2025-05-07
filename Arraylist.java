package com.loopsJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> obj=new ArrayList<Integer>();
//        obj.add(123);
//        obj.add(223);
//        obj.add(165);
//        obj.add(stephen);

		ArrayList obj = new ArrayList<>();

		obj.add("apple");
		obj.add("banana");
		obj.add("grape");
		obj.add("fruits");
		obj.add("jackfruit");
		obj.add(123);
		obj.add(333);
		obj.add(444);

		System.out.println("the arraylist is contains" + obj);

		
//		using iterator to traverse forward direction
		
		
		Iterator<Object>itreator=obj.iterator();
		while (itreator.hasNext()) {
//			Object object = (Object) itreator.next();
			
			System.out.println(itreator.next()+"");
			
		}
		
//		ListItreator
		
	}

}
