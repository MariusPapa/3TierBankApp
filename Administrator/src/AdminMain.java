import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import BLogic.IAdminLogic;
import Controller.Controller;
import Controller.IController;

public class AdminMain {

	public static void main(String[] args) {

		try {

			IAdminLogic admin = (IAdminLogic) Naming
					.lookup("rmi://localhost:1099/admin");

			IController controller = new Controller();
			controller.openApp();
			System.out.println("Admin started .. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
