package com.local;

class Bank{
	String name;
	Bank(){
		System.out.println("contructor worked..");
	}
	void createAccount(String accName) {
		name= accName;
		System.out.println(name);
	}
}

public class Main {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.name= "cengizhan";
		System.out.println(b.name);
		b.createAccount(b.name);
		
		
		int[] myArray2;
		int[] myArray3 = new int[5];
		
		int []myArray5 = new int[5];
		
		int[] myArray7 = null; 
	}
}
