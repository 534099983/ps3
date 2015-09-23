package ps3;




import java.util.Date;


import org.junit.Test;

public abstract class AccountTest {

    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
       


        System.out.println ("The account Id is: "+ account.getId());
        System.out.println ("The account balance is: $" + account.getBalance());
        System.out.println("The annual interest rate is :" + account.getAnnualInterestRate()+"%");
        System.out.println ("The monthly interest rate is: "+ account.getMonthlyInterestRate()+"%");
        System.out.println("The account balance after deposit 2500 is: $" +account.withdraw(2500));
        System.out.println("The account balance after deposit 3000 is: $" +account.deposit(3000));
        System.out.println("The account created time is:"+account.getDateCreated());
        
        
    }
}
