package Model;

public class Admin
{
   private Person personalInfo;
   private int employeeNo;
   private double salary;

   public Admin(Person per, int empNo, double salary)
   {
      this.personalInfo = per;
      this.employeeNo = empNo;
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
      return "Employee number : " + employeeNo + "\nPersonal info : "
            + personalInfo.toString() + "\nSalary : " + salary;
   }
}
