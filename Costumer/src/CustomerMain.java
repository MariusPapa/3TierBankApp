import java.rmi.Naming;

import BLogic.ICustomerLogic;

public class CustomerMain {
	
	public static void main(String[] args) {
		try {

			ICustomerLogic admin = (ICustomerLogic) Naming
					.lookup("rmi://localhost:1097/customer");

			//open controller here
			System.out.println("Admin started .. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
