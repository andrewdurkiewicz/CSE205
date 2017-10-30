import java.text.DecimalFormat;
public class Employee
{

   protected double salary;
   protected String name;
   protected double taxRate;

   Employee(String name)
   {
     salary=0;
     this.name=name;
     taxRate=0.1;
   }
   public void setTaxRate(double taxRate)
   {
	   this.taxRate=taxRate;
   }

   public void calculateSalary()
   {
	   salary=0;
   }
   public String toString()
   {
	 DecimalFormat formatter = new DecimalFormat("#0.00");
	 return "\n\n" + name + "'s salary is " + formatter.format(salary);
   }

}