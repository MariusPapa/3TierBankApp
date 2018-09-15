package BLogic;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Account;

public interface ICustomerLogic extends Remote
{

   public double seeBalance(int accNo) throws RemoteException;
   public void transferMonay(int senderAcc,int receiverAcc,double sum) throws RemoteException;
   public ArrayList<Account> seeAllAccount() throws RemoteException;
 
   
}
