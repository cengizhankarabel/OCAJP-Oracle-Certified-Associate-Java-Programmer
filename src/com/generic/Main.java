package com.generic;

class Generic{
	public Generic(){
		System.out.println("generic works");
	}
	
	public static <E> void display(E[] list){
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		
		Integer[] intList = {1,2,3,4,5};
		String[] stringList = {"ankara","istanbul","izmir"};
		
		
		Generic.display(intList);
		Generic.display(stringList);
		
	}
}
