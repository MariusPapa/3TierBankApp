import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java. net. InetAddress;

public class DatabaseMain {
	
	public static void main(String[] args) {
		
		try
		{
			Registry rg = LocateRegistry.createRegistry(1096);
			IDatabase dbs = new Database();
			rg.rebind("dbs", dbs);
			System.out.println("Starting database server...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
