package ps3;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated =new Date();;
	
	public Account(){
	id=0;
	balance=0;
	annualInterestRate=0;
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	double MonthlyInterestRate;
	public double getMonthlyInterestRate(){
		return MonthlyInterestRate=annualInterestRate/12;
	}
	
	public double withdraw(double withdraw){
		return balance=balance-withdraw;
	}
	public double deposit(double deposit){
		return balance=balance+deposit;
	}
}
