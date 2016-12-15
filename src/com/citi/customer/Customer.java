package com.citi.customer;

public class Customer {
	private String name;

	private String loanType;
	private String gender;
	private String dob;
	private double lamount;
	private int tmonths;

	
	public Customer(String name, String loanType, String gender, String dob, double lamount, int tmonths) {
		super();
		this.name = name;
		this.loanType = loanType;
		this.gender = gender;
		this.dob = dob;
		this.lamount = lamount;
		this.tmonths = tmonths;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getGender(){
		if(gender=="Female")
			return "Female";
		else
		return "Male";
	}
	public String getDob(){
		return dob;
	}
	public double getLamount(){
		return lamount;
	}
	public int getTmonths(){
		return tmonths;
	}
	
	public void setGender(String g)
	{
		gender=g;
	}
	public void setDob(String d)
	{
		dob=d;
	}
	public void setLamount(double la)
	{
		lamount=la;
	}
	public void setTmonths(int tm)
	{
		tmonths=tm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
