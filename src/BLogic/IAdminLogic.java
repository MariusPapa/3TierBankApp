package BLogic;

import java.util.ArrayList;

import Model.Clerk;

public interface IAdminLogic
{
  public void employNewClerk(Clerk clerk);
  public Clerk endClerkContract(int employeeNo);
  public void setSalary(int empNo,double salary);
  public ArrayList<Clerk> getAllClerks();
  //maybe?
  //public void changeClerkAddress(int employeeNo,String address,);
}
