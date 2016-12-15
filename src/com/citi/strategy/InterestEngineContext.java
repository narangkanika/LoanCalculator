package com.citi.strategy;

import com.citi.customer.Customer;

public class InterestEngineContext {
 
	public static InterestEngine getInterestEngine(Customer customer){
		
		//Based on the input strategy class should be created and returned
		
		InterestEngine engine = new EnhancedInterestedEngine();
		return engine;
	}
	
}
