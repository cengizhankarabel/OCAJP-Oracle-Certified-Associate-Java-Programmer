package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("App started..");

		ArrayList<Integer> arr = new ArrayList<>() {
			{
				add(1);
				add(2);
				add(3);
			}
		};
		
		arr.forEach(e -> System.out.println(e));
		
		
		
		List<Employee> empList = new ArrayList<>();
		
		//Collections.sort(empList, new );
	//	empList.sort(new Em);
	}
}
