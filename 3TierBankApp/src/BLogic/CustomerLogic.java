package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Controller.Controller;
import Controller.IController;
import Model.Account;
import Model.Customer;
import Model.CustomerList;

public class CustomerLogic extends UnicastRemoteObject implements
      ICustomerLogic
{
	private IController controller;
	
   public CustomerLogic() throws RemoteException
   {
	   this.controller = new Controller();
   }
   

   /**
    * Returns the balance for a specific account found by account number. Return
    * -1 if the account does not exists
    * 
    * @return
    **/
   @Override
   public double seeBalance(int accNo)
   {
	  return controller.seeBalance(accNo);
   }

   @Override
   public void transferMonay(int senderAcc, int receiverAcc, double sum)
   {
      controller.transferMonay(senderAcc, receiverAcc, sum);
   }

   /**
    * Finds an account searching through all customers accounts based an account
    * number Return null if the account doesn't exists
    * 
    * @return
    **/
   public Account findReceiverAcc(int acc)
   {
	   //Need to review this function. 
	   return null;
   }

   @Override
   public ArrayList<Account> seeAllAccount()
   {
      return controller.seeAllAccount();
   }

}
