package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Model.Account;
import Model.Customer;
import Model.CustomerList;
import Model.Person;

public class ClerkLogic extends UnicastRemoteObject implements IClerkLogic
{
   private CustomerList cList;
   
    public ClerkLogic(CustomerList c) throws RemoteException
   {
     this.cList=c;
   }

   @Override
   public void registerCustomer(Customer c)
   {
      cList.addCustomer(c);
      
   }

   /**
    * Searching for a specific customer by social security number
    * 
    * @return
    **/
   public synchronized Customer seeCustomerInfo(int ssn)
   {

     return cList.getCustomer(ssn);

   }

   @Override
   public Account closeCustomerAccount(int ssn, int accNo)
   {
     return cList.getCustomer(ssn).deleteAccount(accNo);
   }

   @Override
   public Customer closeCustomerContract(int ssn)
   {
      // TODO Auto-generated method stub
     return cList.removeCustomer(ssn);
   }

   @Override
   public void changeCustomerAddress(int ssn, String address)
   {
      // TODO Auto-generated method stub
      cList.getCustomer(ssn).getCustomerInfo().setStreetAddress(address);
   }

   @Override
   public ArrayList<Customer> getAllCustomers()
   {
      // TODO Auto-generated method stub
      return cList.getAllCustomers();
   }

}
