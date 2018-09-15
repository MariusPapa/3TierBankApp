import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Controller.Controller;
import Controller.IController;


public class Database implements IDatabase{
	
	private IController controller;
	
	public Database()throws RemoteException, ClassNotFoundException
	{
		controller = new Controller();
		UnicastRemoteObject.exportObject(this, 0);
	}

}
