package pkaccount.fd;
import pkaccount.Account;
import pkbanking.pkinterface.*;

public class FDAccount extends Account implements InterestRate
{
  public int period;

  public FDAccount()
  {
    super();
  }

  public FDAccount(int accno, int period,double amount)
  {
    super(accno,amount);
    this.period = period;
  }

  public double calc_interest()
  {
    return balance*fdrate/12; 
  }
  
  public void close()
  {
    System.out.println();
    System.out.println("Current Balance : "+balance);
    balance += calc_interest();
    System.out.println("New Balance : "+balance);
  }
}