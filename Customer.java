package pkcustomer;
import pkaccount.sb.*;
import pkaccount.fd.*;
import java.util.*;

public class Customer 
{
  public int cust_id,i=0;
  public String name, address;
  public SBAccount sb;
  public FDAccount fd;
  public int saccno = 12345;
  public int faccno = 54321;
  Scanner sc;
  public Customer()
  {
    cust_id = 0;
    name = null;
    address = null;
  }

  public Customer(int cust_id, String name, String address)
  {
    this.cust_id = cust_id;
    this.name = name;
    this.address = address;
    System.out.println();
    System.out.println("Customer Id : "+cust_id);
    System.out.println("Name : "+name);
    System.out.println("Address : "+address);
    sc = new Scanner(System.in);
  }

  public void createAccount(int type)
  {
    if(type == 1)
    {
      System.out.println();
      System.out.println("SB Account Created");
      System.out.println("SB Account No : "+ saccno++);
      System.out.println("Enter Initial Amount : ");
      int amount = sc.nextInt();
      sb = new SBAccount(saccno,amount);
    }
    else if(type == 2)
    {
      System.out.println();
      System.out.println("FB Account Created");
      System.out.println("FB Account No : "+ faccno++);
      System.out.println("Enter Initial Amount & Period : ");
       int amount = sc.nextInt();
       int period = sc.nextInt();
      fd = new FDAccount(faccno,period,amount);
    }
    else
     System.out.println("Invalid Type");
  }

  public void transaction(int type)
  {
    if(type==1)
    {
      System.out.println();
      System.out.println("Enter amount to deposit : ");
      int amount = sc.nextInt();
       sb.deposit(amount);
    }
    else if(type==2)
    {
     System.out.println();
     System.out.println("Enter amount to withdraw : ");
     int amount = sc.nextInt();
     sb.withdraw(amount); 
    }
    else if(type==3)
     sb.calc_interest();
    else if(type==4)
     fd.close();
    else
     System.out.println("Invalid choice");
  }
}