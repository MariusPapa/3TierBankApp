package BLogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Account;
import Model.Customer;
import Model.Person;

public interface IClerkLogic extends Remote {
	public void registerCustomer(Customer c) throws RemoteException;

	public Customer seeCustomerInfo(int ssn) throws RemoteException;

	public Account closeCustomerAccount(int ssn, int accNo)
			throws RemoteException;

	public Customer closeCustomerContract(int ssn) throws RemoteException;

	public void changeCustomerAddress(int ssn, String address)
			throws RemoteException;

	public ArrayList<Customer> getAllCustomers() throws RemoteException;
}
