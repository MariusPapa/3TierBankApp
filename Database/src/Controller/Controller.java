package Controller;

import Adapter.Adapter;
import Adapter.IAdapter;

public class Controller implements IController{
	
	private IAdapter adapter;
	
	public Controller() throws ClassNotFoundException
	{
		adapter = new Adapter();
	}
}
