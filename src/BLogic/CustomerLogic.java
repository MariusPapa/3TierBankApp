package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Model.Account;
import Model.Customer;
import Model.CustomerList;

public class CustomerLogic extends UnicastRemoteObject implements
      ICustomerLogic
{
   Customer cust;
   CustomerList customers;

   public CustomerLogic(Customer cust, CustomerList list)
         throws RemoteException
   {
      this.cust = cust;
      this.customers = list;
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

      for (int i = 0; i < cust.getAccounts().size(); i++)
      {
         if (cust.getAccounts().get(i).getAccountNo() == accNo)
         {
            return cust.getAccounts().get(i).getBalance();
         }
      }
      return -1;

   }

   @Override
   public void transferMonay(int senderAcc, int receiverAcc, double sum)
   {
      for (int i = 0; i < cust.getAccounts().size(); i++)
      {
         // find the account from which you transfer the money and check the
         // balance
         if (cust.getAccounts().get(i).getAccountNo() == senderAcc
               && cust.getAccounts().get(i).getBalance() >= sum)
         {
            // find the receiver account and check if is active
            if (findReceiverAcc(receiverAcc) != null
                  && findReceiverAcc(receiverAcc).isActiv() == true)
            {
               cust.getAccounts().get(i)
                     .setBalance(cust.getAccounts().get(i).getBalance() - sum);
               findReceiverAcc(receiverAcc).setBalance(
                     findReceiverAcc(receiverAcc).getBalance() + sum);
            }
            else
            {
               System.out
                     .println("The receiver account does not exists or is inactive");
            }
         }
         else
         {
            System.out
                  .println("Incorect account number or not enough money in your account");
         }
      }

   }

   /**
    * Finds an account searching through all customers accounts based an account
    * number Return null if the account doesn't exists
    * 
    * @return
    **/
   public Account findReceiverAcc(int acc)
   {
      for (int i = 0; i < customers.size(); i++)
      {
         if (customers.getAllCustomers().get(i).getAccounts().get(i)
               .getAccountNo() == acc)
         {
            return customers.getAllCustomers().get(i).getAccount(acc);
         }
      }
      return null;
   }

   @Override
   public ArrayList<Account> seeAllAccount()
   {
      return this.cust.getAccounts();

   }

}
