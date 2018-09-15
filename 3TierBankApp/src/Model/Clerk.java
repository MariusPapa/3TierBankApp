package Model;

public class Clerk
{
   private Person personalInfo;
   private int employeeNo;
   private double salary;

   public Clerk(Person per, int eNo, double salary)
   {
      this.personalInfo = per;
      this.employeeNo = eNo;
      this.salary = salary;
   }

   public synchronized Person getPersonalInfo()
   {
      return personalInfo;
   }

   public synchronized void setPersonalInfo(Person personalInfo)
   {
      this.personalInfo = personalInfo;
   }

   public synchronized int getEmployeeNo()
   {
      return employeeNo;
   }

   public synchronized void setEmployeeNo(int employeeNo)
   {
      this.employeeNo = employeeNo;
   }

   public synchronized double getSalary()
   {
      return salary;
   }

   public synchronized void setSalary(double salary)
   {
      this.salary = salary;
   }

   public synchronized String toString()
   {
      return "Employee number : " + employeeNo + "\nPersonal info : " + "\n"
            + personalInfo.toString() + "\nSalary : " + salary;
   }
}
