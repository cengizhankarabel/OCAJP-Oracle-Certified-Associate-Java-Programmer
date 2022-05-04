package com.project;

public class FullTimeEmployee extends Employee{

	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double deducHealthInsurancePremium() {
		return(HEALTH_INSURANCE_PERCENTAGE* employeeSalary) /100;
	}

}
