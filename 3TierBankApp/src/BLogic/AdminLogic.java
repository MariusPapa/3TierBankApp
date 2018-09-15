package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Model.Clerk;
import Model.ClerkList;

public class AdminLogic extends UnicastRemoteObject implements IAdminLogic
{
   private ClerkList clerks;
   
   public AdminLogic() throws RemoteException
   {
	   this.clerks = new ClerkList();
   }
   public AdminLogic(ClerkList c) throws RemoteException
   {
      this.clerks = c;
   }

   @Override
   public void employNewClerk(Clerk clerk)
   {
      // TODO Auto-generated method stub
      this.clerks.employClerck(clerk);
   }

   @Override
   public Clerk endClerkContract(int employeeNo)
   {
      // TODO Auto-generated method stub
      return this.clerks.removeClerk(employeeNo);
   }

   // the method getAllClerks from ClerkList should be removed??????
   @Override
   public ClerkList getAllClerks()
   {
      // TODO Auto-generated method stub
      return clerks;
   }

   /**
    * Finds an employee by employee number and sets a new salary for that
    * employee
    * 
    * @param empNo
    *           ,salary
    **/
   @Override
   public void setSalary(int empNo, double salary)
   {
      for (int i = 0; i < clerks.size(); i++)
      {

         if (clerks.getAllClerks().get(i).getEmployeeNo() == empNo)
            clerks.getAllClerks().get(i).setSalary(salary);
      }

   }

}
