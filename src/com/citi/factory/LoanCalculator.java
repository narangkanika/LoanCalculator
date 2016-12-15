package com.citi.factory;
import com.citi.customer.Customer;
import com.citi.strategy.InterestEngine;

public interface LoanCalculator {

	void setStrategy(InterestEngine strategy);
	
	public double calculateEMI(Customer customer);

	
}
