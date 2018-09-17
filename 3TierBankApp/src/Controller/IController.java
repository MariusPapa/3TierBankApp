package Controller;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Account;
import Model.Customer;

public interface IController {
	  
	   public void registerCustomer(Customer c);
	   public Customer seeCustomerInfo(int ssn);
	   public Account closeCustomerAccount(int ssn,int accNo);
	   public Customer closeCustomerContract(int ssn);
	   public void changeCustomerAddress(int ssn,String address);
	   public ArrayList<Customer> getAllCustomers();
}
