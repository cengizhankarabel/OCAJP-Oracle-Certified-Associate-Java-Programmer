package com.testclass;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Long> l1 = new ArrayList<Long>();
		l1.add(Long.valueOf(10));
		List<Number> l2 = l1; 
		System.out.println(l2);
	}
}

