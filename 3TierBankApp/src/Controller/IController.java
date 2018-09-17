package Controller;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Account;
import Model.Clerk;
import Model.ClerkList;
import Model.Customer;

public interface IController {

	public void registerCustomer(Customer c);

	public Customer seeCustomerInfo(int ssn);

	public Account closeCustomerAccount(int ssn, int accNo);

	public Customer closeCustomerContract(int ssn);

	public void changeCustomerAddress(int ssn, String address);

	public ArrayList<Customer> getAllCustomers();

	public double seeBalance(int accNo);

	public void transferMonay(int senderAcc, int receiverAcc, double sum);

	public ArrayList<Account> seeAllAccount();

	public void employNewClerk(Clerk clerk);

	public Clerk endClerkContract(int employeeNo);

	public void setSalary(int empNo, double salary);

	public ClerkList getAllClerks();
}
