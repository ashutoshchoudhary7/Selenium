package com.test1.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> products = new HashSet<String>();
		
		products.add("IPhone");
		products.add("Tablet");
		products.add("Desktop");
		products.add("IPhone");
		products.add("Tablet");
		products.add("Desktop");
		products.add("IPhone");
		products.add("Tablet");
		products.add("Desktop");
		
		System.out.println("Count : " + products.size());
		
		Iterator<String> itr =  products.iterator();

		System.out.println(itr.next());
		System.out.println(itr.next());
		
		System.out.println("=======Getting all the elements using For loop ==========");
		Iterator<String> itr2 =  products.iterator();
		for(int i=0;i<products.size();i++)
		{
			System.out.println(itr2.next());
		}

	}

}
