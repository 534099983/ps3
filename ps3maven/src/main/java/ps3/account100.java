package ps3;


	import java.util.Date;

	public class account100 {
		
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated =new Date();;
		
		public account100(){
		id=0;
		balance=0;
		annualInterestRate=0;
		}
		
		public account100(int id, double balance){
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
		
		public void withdraw(double amount) throws
        InsufficientFundsException
{
if(amount <= balance)
{
balance -= amount;
}
else
{
double needs = amount - balance;
throw new InsufficientFundsException(needs);
}
}
		
		public double deposit(double deposit){
			return balance=balance+deposit;
		}

}
