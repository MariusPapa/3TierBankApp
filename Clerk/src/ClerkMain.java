import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import BLogic.IClerkLogic;


public class ClerkMain {
	
	public static void main(String[] args) {
		try {
			IClerkLogic sir = (IClerkLogic) Naming
					.lookup("rmi://localhost:1098/clerk");
			//code here
			System.out.println("Clerk started ... ");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
