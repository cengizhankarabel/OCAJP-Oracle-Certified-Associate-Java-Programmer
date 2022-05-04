package com.project;

public interface Remunerator {
	
	public abstract double deductFoodFee();
	public final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
    public default double deductHealthInsurancePremium() {
		return 0;
    	
    }
}
