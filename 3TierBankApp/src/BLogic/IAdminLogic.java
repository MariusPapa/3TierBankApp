package BLogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Clerk;
import Model.ClerkList;

public interface IAdminLogic extends Remote
{
  public void employNewClerk(Clerk clerk) throws RemoteException;
  public Clerk endClerkContract(int employeeNo) throws RemoteException;
  public void setSalary(int empNo,double salary) throws RemoteException;
  public ClerkList getAllClerks() throws RemoteException;
  //maybe?
  //public void changeClerkAddress(int employeeNo,String address,);
}
