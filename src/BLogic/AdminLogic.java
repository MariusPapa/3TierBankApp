package BLogic;

import java.util.ArrayList;

import Model.Clerk;
import Model.ClerkList;

public class AdminLogic implements IAdminLogic
{
   private ClerkList clerks;
   
   public AdminLogic(ClerkList c)
   {
      this.clerks=c;
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

//the method getAllClerks from ClerkList should be removed??????
   @Override
   public ArrayList<Clerk> getAllClerks()
   {
      // TODO Auto-generated method stub
      return clerks.getAllClerks();
   }

   /**
    * Finds an employee by employee number and sets a new salary for that employee
    * @param empNo,salary 
    * **/
   @Override
   public void setSalary(int empNo, double salary)
   {
      for(int i=0;i<getAllClerks().size();i++)
      {
         if(getAllClerks().get(i).getEmployeeNo()==empNo)
            getAllClerks().get(i).setSalary(salary);
      }
      
   }

}
