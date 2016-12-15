package com.citi.factory;
import com.citi.customer.Customer;
import com.citi.strategy.InterestEngine;

public class PersonalLoanCalculator implements LoanCalculator {
	public double calculateEMI(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Personalloan Calculator");
		return 0;
	}

	@Override
	public void setStrategy(InterestEngine strategy) {
		// TODO Auto-generated method stub
		
	}
}
