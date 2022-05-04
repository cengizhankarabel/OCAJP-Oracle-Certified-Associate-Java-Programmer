package com.testtest;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.print("In try ");
			return;
		}
		finally {
			System.out.print("In finally ");
		}
		System.out.print("Outside block "); 
	}
}
