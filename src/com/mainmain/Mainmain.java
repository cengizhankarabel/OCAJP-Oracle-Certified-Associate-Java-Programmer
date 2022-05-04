package com.mainmain;

import java.awt.Window.Type;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface DemoInterface{
	
	int a=5;
	
	int addNumbers(int a, int b);
}

class DemoInterfaceImpl implements DemoInterface{

	@Override
	public int addNumbers(int a, int b) {
		
		return  a+b;
		
		 
	}
	
}

public class Mainmain {
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		
		numList.forEach((number) -> System.out.println(number));
		
		DemoInterface addSolution = (int a, int b) -> (a);
		
		
	}
}
