package Model;

import java.util.ArrayList;

public class ClerkList
{
private ArrayList<Clerk> clerks;

public ClerkList()
{
   this.clerks=new ArrayList<Clerk>();
}
/**
 * Adding a new clerck to the list
 * @param c
 * **/
public synchronized void employClerck(Clerk c)
{
   if(!clerks.contains(c))
   clerks.add(c);
}
/**
 * Removes a clerk from the list by employee number
 * @return 
 * **/
public synchronized Clerk removeClerk(int empNo)
{
   Clerk clerk;
   for(Clerk c : clerks)
   {
      if (c.getEmployeeNo()==empNo)
      {
         clerk=c;
         clerks.remove(c);
         return clerk;
      }
   }
   return null;
}
/**
 * The list with all clerks
 * @return
 * **/
public synchronized ArrayList<Clerk> getAllClerks()
{
   return clerks;
}
/**
 * The total number of clerks as an integer
 * @return 
 * **/
public synchronized int size()
{
   return clerks.size();
}
public synchronized String toString()
{
   String s="";
   for(Clerk c : clerks)
      s+="\n"+ c.toString();
   return s;
}
}
