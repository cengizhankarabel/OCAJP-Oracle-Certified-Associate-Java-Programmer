package com.techsol;

interface Deduction {
	static void deduct() {
		System.out.println("deduct");
	}
}
@SuppressWarnings("")
class Customer implements Deduction {
	public void serviceCharge() {
        //deduction functionality being invoked
		Deduction.deduct();;
	}
}
public class TechSol {
	public static void main(String[] args) {
		new Customer().serviceCharge();	
	}
}
