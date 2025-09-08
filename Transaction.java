package pkbanking.pkinterface;

public interface Transaction
{
  public int min_balance = 500;
  
  void withdraw(double amount);
  void deposit(double amount);
}

