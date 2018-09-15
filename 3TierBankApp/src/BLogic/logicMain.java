package BLogic;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class logicMain {
	
	public static void main(String[] args) {
		try
		{
			//creating registries
			/*
			 * customer 		- port 1097
			 * clerk 			- port 1098
			 * administrator 	- port 1099
			 * */
			Registry adminRg = LocateRegistry.createRegistry(1099);
			Registry clerkRg = LocateRegistry.createRegistry(1098);
			Registry customerRg = LocateRegistry.createRegistry(1097);

			
			//initializing objects
			IAdminLogic admin = new AdminLogic();
			IClerkLogic clerk = new ClerkLogic();
			ICustomerLogic customer = new CustomerLogic();			
			
			//uploading objects in the registry
			adminRg.rebind("admin", admin);
			clerkRg.rebind("clerk", clerk);
			customerRg.rebind("customer", customer);
			
			System.out.println("Starting server...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
