package pkaccount.sb;
import pkaccount.Account;
import pkbanking.pkinterface.*;

public class SBAccount extends Account implements Transaction, InterestRate
{
  
  public SBAccount()
  {
   super();
  }
  
  public SBAccount(int accnumber, double balance)
  {
    super(accnumber,balance);
  }

  public void deposit(double amount)
  {
    if(amount > 0)
    {
     System.out.println();
     System.out.println("Current Balance : "+balance);
     balance += amount;
     System.out.println("New Balance : "+balance);
    }
    else
     System.out.println("Invalid amount");
  }

  public void withdraw(double amount)
  {
    if(balance-amount > min_balance)
    {
       System.out.println();
      System.out.println("Current Balance : "+balance);
      balance -= amount;
      System.out.println("New Balance : "+balance);
    }
    else
     System.out.println("Insufficient Balance");
  }

  public void calc_interest()
  {
   System.out.println();
   System.out.println("Current Balance : "+balance);
   balance += balance*sbrate/12;
   System.out.println("New Balance : "+balance);
  }
}