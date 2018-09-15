package Model;

import java.util.ArrayList;

public class AdminList
{
private ArrayList<Admin> admins;

public AdminList()
{
   this.admins=new ArrayList<Admin>();
}
/**
 * Adding a new admin to the list
 * @param a
 * **/
public synchronized void employAdmin(Admin a)
{
   if(!this.admins.contains(a))
      this.admins.add(a);
}

/**
 * Removes a admin from the list identified by employee number
 * @return
 * **/
public synchronized Admin removeAdmin(int empNo)
{
   Admin a;
   for(Admin adm : admins)
   {
      if (adm.getEmployeeNo()==empNo)
      {
         a=adm;
         admins.remove(adm);
         return a;
      }
   }
   return null;
}

public synchronized String toString()
{
   String s="";
   for(Admin a : admins)
   {
      s+="\n"+a.toString();
   }
   return s;
}
}
