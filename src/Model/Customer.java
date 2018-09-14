package Model;

import java.util.ArrayList;
import java.util.Date;

public class Customer
{
   private Person personalInfo;
   private ArrayList<Account> accounts;
   private Date clientFrom;

   public Customer(Person per, ArrayList<Account> acoounts, Date clinetFrom)
   {
      this.personalInfo = per;
      this.accounts = acoounts;
      this.clientFrom = clinetFrom;
   }

 

   public Customer(Person per, Date clinetFrom)
   {
      this.personalInfo = per;
      this.accounts = new ArrayList<Account>();
      this.clientFrom = clinetFrom;
   }

   /**
    * Add a new account for this customer in account list
    * @param acc
    * */
   public synchronized void addAccount(Account acc)
   {
      this.accounts.add(acc);
   }
   /**
    * Removes one of accounts owned by the customer from the account list
    * @return
    * */
   public synchronized Account deleteAccount(int accNo)
   { Account acc;
      for(int i=0;i<this.accounts.size();i++)
      {
         if(this.accounts.get(i).getAccountNo()==accNo)
         {
            acc=this.accounts.get(i);
            return acc;
         }
            
      }
      return null;
   }

   public synchronized Person getCustomerInfo()
   {
      return personalInfo;
   }
   public synchronized ArrayList<Account> getAccounts()
   {
      return accounts;
   }

   public synchronized void setAccounts(ArrayList<Account> accounts)
   {
      this.accounts = accounts;
   }

   public synchronized String toString()
   {
      return "Customer info : "+"\n" + personalInfo.toString() + "\nAccounts : "
            + accounts.toString() + "\nClint from :" + clientFrom;
   }

}
