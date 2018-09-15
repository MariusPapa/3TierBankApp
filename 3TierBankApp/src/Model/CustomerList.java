package Model;

import java.util.ArrayList;

public class CustomerList
{
   private ArrayList<Customer> customers;

   public CustomerList()
   {
      this.customers = new ArrayList<Customer>();
   }

   /**
    * Adding a new Customer
    * 
    * @param c
    **/
   public synchronized void addCustomer(Customer c)
   {
      if (!customers.contains(c))
         this.customers.add(c);
   }

   /**
    * Removing a Customer from the customers list
    * 
    * @return
    */
   public synchronized Customer removeCustomer(int ssn)
   {
      Customer cust;
      for (int i = 0; i < this.customers.size(); i++)
      {
         if (this.customers.get(i).getCustomerInfo().getSsn() == ssn)
         {
            cust = this.customers.get(i);
            this.customers.remove(i);
            return cust;

         }
      }
      return null;
   }

   /**
    * Searching for a specific customer by social security number
    * 
    * @return
    **/
   public synchronized Customer getCustomer(int ssn)
   {

      for (int i = 0; i < this.customers.size(); i++)
      {
         if (this.customers.get(i).getCustomerInfo().getSsn() == ssn)
         {
            return this.customers.get(i);

         }
      }
      return null;

   }
   
   public ArrayList<Customer> getAllCustomers()
   {
      return customers;
   }
   
   /**
    * The number of customers 
    * @return
    * **/
   public int size()
   {
      return customers.size();
   }

   /**
    * Display all customers
    * 
    * @return
    */
   public synchronized String toString()
   {
      String s = "";
      for (Customer c : customers)
         s += "\n" + c.toString();

      return s;
   }
}
