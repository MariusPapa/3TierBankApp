package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Controller.Controller;
import Controller.IController;
import Model.Account;
import Model.Customer;
import Model.CustomerList;
import Model.Person;

public class ClerkLogic extends UnicastRemoteObject implements IClerkLogic
{
	private IController controller;
	
    public ClerkLogic() throws RemoteException
   {
    	this.controller = new Controller();
   }

   @Override
   public void registerCustomer(Customer c)
   {
      controller.registerCustomer(c);
      
   }

   /**
    * Searching for a specific customer by social security number
    * 
    * @return
    **/
   public synchronized Customer seeCustomerInfo(int ssn)
   {
     return controller.seeCustomerInfo(ssn);
   }
   @Override
   public Account closeCustomerAccount(int ssn, int accNo)
   {
     return controller.closeCustomerAccount(ssn, accNo);
   }

   @Override
   public Customer closeCustomerContract(int ssn)
   {
     return controller.closeCustomerContract(ssn);
   }

   @Override
   public void changeCustomerAddress(int ssn, String address)
   {
      controller.changeCustomerAddress(ssn, address);;
   }

   @Override
   public ArrayList<Customer> getAllCustomers()
   {
      // TODO Auto-generated method stub
      return controller.getAllCustomers();
   }

}
