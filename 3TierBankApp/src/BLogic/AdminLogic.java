package BLogic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Controller.Controller;
import Controller.IController;
import Model.Clerk;
import Model.ClerkList;

public class AdminLogic extends UnicastRemoteObject implements IAdminLogic
{
private IController controller;   
   public AdminLogic() throws RemoteException
   {
	   this.controller = new Controller();
   }

   @Override
   public void employNewClerk(Clerk clerk)
   {
      // TODO Auto-generated method stub
      this.controller.employNewClerk(clerk);
   }

   @Override
   public Clerk endClerkContract(int employeeNo)
   {
      // TODO Auto-generated method stub
      return controller.endClerkContract(employeeNo);
   }

   // the method getAllClerks from ClerkList should be removed??????
   @Override
   public ClerkList getAllClerks()
   {
      // TODO Auto-generated method stub
      return controller.getAllClerks();
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
	   controller.setSalary(empNo, salary);
   }
}
