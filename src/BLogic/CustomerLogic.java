package BLogic;

import java.util.ArrayList;

import Model.Account;
import Model.Customer;

public class CustomerLogic implements ICustomerLogic
{
Customer cust;

public  CustomerLogic(Customer cust)
{
   this.cust=cust;
}
   @Override
   public double seeBalance(Account acc)
   {
     return acc.getBalance();
      
     
   }

   @Override
   public void transferMonay(double sum)
   {
      // TODO Auto-generated method stub
      
   }

   @Override
   public ArrayList<Account> seeAllAccount()
   {
      return this.cust.getAccounts();
      
   }

}
