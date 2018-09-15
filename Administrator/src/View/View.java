package View;

import java.awt.Window;

import Model.Customer;

public class View implements IView {

	private AdminAPP adminApp;

	public View() {
		
		adminApp = new AdminAPP();
	}

	@Override
	public void show(Customer customer) {
		System.out.println(customer);
	}

	public void showAdminAPP() {
		adminApp.frame.setVisible(true);
	}
}
