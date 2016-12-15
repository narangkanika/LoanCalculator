import java.util.Scanner;

import com.citi.customer.Customer;
import com.citi.factory.LoanCalculator;
import com.citi.factory.LoanCalculatorFactory;

public class AppMain {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int choice, tenure=0;
		double interest=0.0,emi=0.0,la=0.0;
		String gend,DOB;
		Customer cust=new Customer("Sonali","HOME","Female","01-01-1991",5000.0,6);
		/*System.out.println("Enter the Principal amount: ");
		la=in.nextDouble();
		System.out.println("Enter the loan borrower's DOB: ");
		DOB=in.next();
		System.out.println("Enter the loan borrower's gender: ");
		gend=in.next();
		System.out.println(gend);
		System.out.println("Enter the tenure(in months): ");
		tenure=in.nextInt();
		System.out.println("Enter the type of loan you want: \n1)Home Loan \n2)Car loan \n3)Personal Loan\n");
		choice=in.nextInt();
		cust.setDob(DOB);
		cust.setGender(gend);
		cust.setLamount(la);
		cust.setTmonths(tenure);*/
		in.close();	
		requestForLoan(cust);
	}
	private static void requestForLoan(Customer customer){
		LoanCalculator loanCalculator = LoanCalculatorFactory.getLoanCalculator(customer.getLoanType());
		double emi=loanCalculator.calculateEMI(customer);
		
	}
	}


