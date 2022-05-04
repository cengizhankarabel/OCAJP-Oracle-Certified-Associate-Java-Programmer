package com.multipleinheritance;

interface Greeting {
	default void hello() {
		System.out.println("inside interface");
	}
}

class Deneme implements Greeting{
	public void hello() {
		System.out.println("inside class");
	}
}


public class InheritanceProblem  {
	public static void main(String[] args) {
		
	
		Greeting gr= new Deneme();
		gr.hello();
	}
}
