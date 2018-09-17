package Controller;

import java.util.ArrayList;

import Model.Account;
import Model.AdminList;
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
	
	public Controller()
	{
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
	     return customerList.getCustomer(ssn);	}

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
	      customerList.getCustomer(ssn).getCustomerInfo().setStreetAddress(address);		
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
	      return customerList.getAllCustomers();
	}
	
	
	
}
