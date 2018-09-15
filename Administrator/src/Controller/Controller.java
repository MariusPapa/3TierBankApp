package Controller;

import View.IView;
import View.View;

public class Controller implements IController{
	private IView view;
	
	public Controller()
	{
		 view = new View();
	}
	
	public void  openApp()
	{
		view.showAdminAPP();
	}
}
