package BLogic;

import java.util.ArrayList;

import Model.Account;

public interface ICustomerLogic
{

   public double seeBalance(Account acc);
   public void transferMonay(double sum);
   public ArrayList<Account> seeAllAccount();
 
   
}
