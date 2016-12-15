package com.citi.factory;

public class LoanCalculatorFactory {
	public static LoanCalculator getLoanCalculator(String type){
		LoanCalculator lc=null;
		switch(type){
		case "HOME":
			lc=new HomeLoanCalculator();
			break;
		case "CAR":
			lc=new CarLoanCalculator();
			break;
		case "PERSONAL":
			lc=new PersonalLoanCalculator();
			break;
		}
		return lc;
	}
}
