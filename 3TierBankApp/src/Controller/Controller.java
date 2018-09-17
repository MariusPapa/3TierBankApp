package Controller;

import java.util.ArrayList;

import Model.Account;
import Model.AdminList;
import Model.Clerk;
import Model.ClerkList;
import Model.Customer;
import Model.CustomerList;

public class Controller implements IController {

	private CustomerList customerList;
	private ClerkList clerkList;
	private AdminList adminList;

	public Controller(CustomerList customerList, ClerkList clerkList,
			AdminList list) {

		this.customerList = customerList;
		this.clerkList = clerkList;
		this.adminList = list;
	}

	public Controller() {
		this.customerList = new CustomerList();
		this.clerkList = new ClerkList();
		this.adminList = new AdminList();
	}

	@Override
	public void registerCustomer(Customer c) {
		customerList.addCustomer(c);
	}

	@Override
	public Customer seeCustomerInfo(int ssn) {
		return customerList.getCustomer(ssn);
	}

	@Override
	public Account closeCustomerAccount(int ssn, int accNo) {
		return customerList.getCustomer(ssn).deleteAccount(accNo);
	}

	@Override
	public Customer closeCustomerContract(int ssn) {
		return customerList.removeCustomer(ssn);
	}

	@Override
	public void changeCustomerAddress(int ssn, String address) {
		customerList.getCustomer(ssn).getCustomerInfo()
				.setStreetAddress(address);
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		return customerList.getAllCustomers();
	}

	@Override
	public double seeBalance(int accNo) {

		// TO IMPLEMENT
		return -1;
	}

	@Override
	public void transferMonay(int senderAcc, int receiverAcc, double sum) {
		// TO IMPLEMENT
	}

	public Account findReceiverAcc(int acc) {
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.getAllCustomers().get(i).getAccounts().get(i)
					.getAccountNo() == acc) {
				return customerList.getAllCustomers().get(i).getAccount(acc);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Account> seeAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void employNewClerk(Clerk clerk) {
		this.clerkList.employClerck(clerk);
	}

	@Override
	public Clerk endClerkContract(int employeeNo) {

		return this.clerkList.removeClerk(employeeNo);
	}

	@Override
	public void setSalary(int empNo, double salary) {
		for (int i = 0; i < clerkList.size(); i++) {

			if (clerkList.getAllClerks().get(i).getEmployeeNo() == empNo)
				clerkList.getAllClerks().get(i).setSalary(salary);
		}
	}

	@Override
	public ClerkList getAllClerks() {
		// TODO Auto-generated method stub
		return clerkList;
	}

}
