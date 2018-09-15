package Model;

import java.util.Date;

public class Person
{
   private String fistName;
   private String lastName;
   private Date dob;
   private String streetAddress;
   private String city;
   private int ssn;

   public Person(String fName, String lName, Date dob, String address,
         String city,int ssn)
   {
      this.fistName = fName;
      this.lastName = lName;
      this.dob = dob;
      this.streetAddress =address;
      this.city = city;
      this.ssn=ssn;
      
   }

   public synchronized String getFistName()
   {
      return fistName;
   }

   public synchronized void setFistName(String fistName)
   {
      this.fistName = fistName;
   }

   public synchronized String getLastName()
   {
      return lastName;
   }

   public synchronized void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public synchronized Date getDob()
   {
      return dob;
   }

   public synchronized void setDob(Date dob)
   {
      this.dob = dob;
   }

   public synchronized String getStreetAddress()
   {
      return streetAddress;
   }

   public synchronized void setStreetAddress(String streetAddress)
   {
      this.streetAddress = streetAddress;
   }

   public synchronized String getCity()
   {
      return city;
   }

   public synchronized void setCity(String city)
   {
      this.city = city;
   }

   public synchronized int getSsn()
   {
      return ssn;
   }

   public synchronized void setSsn(int ssn)
   {
      this.ssn = ssn;
   }
   public synchronized String toString()
   {
      return "First name : " + fistName + "\nLast name : " + lastName
            + "\nDate of birth : " + dob + "\nStreet address : "
            + streetAddress + "\nCity : " + city+"\nSSN : "+ssn;
   }

 
}
