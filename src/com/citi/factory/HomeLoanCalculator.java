package com.citi.factory;
import com.citi.customer.Customer;
import com.citi.strategy.InterestEngine;

public class HomeLoanCalculator implements LoanCalculator{
	private InterestEngine strategy;
	
	@Override
	public double calculateEMI(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Homeloan Calc");
		double rate=strategy.getApplicableRate();
		return rate*10;
	}

	@Override
	public void setStrategy(InterestEngine strategy) {
		// TODO Auto-generated method stub
		this.strategy=strategy;
	}
	
}
