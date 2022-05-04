package com.app;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		String str = "Hello world";
		String revString="";
		
		for(int i=str.length()-1; i>=0; i--) {
			revString += str.charAt(i);
		}
		System.out.println(revString);
		
		List list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.remove(0);
		
		System.out.println(list);
		
		
		
		
		


	}
}
