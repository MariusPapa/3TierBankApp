package BLogic;

import java.util.ArrayList;

import Model.Clerk;
import Model.ClerkList;

public interface IAdminLogic
{
  public void employNewClerk(Clerk clerk);
  public Clerk endClerkContract(int employeeNo);
  public void setSalary(int empNo,double salary);
  public ClerkList getAllClerks();
  //maybe?
  //public void changeClerkAddress(int employeeNo,String address,);
}
