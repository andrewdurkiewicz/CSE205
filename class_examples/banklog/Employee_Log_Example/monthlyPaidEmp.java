import java.text.DecimalFormat;
public class monthlyPaidEmp extends Employee
{
   private double annualSalary;

   public monthlyPaidEmp(String name, double annualSalary)
   {
     super(name);
     this.annualSalary=annualSalary;
   }

   public void calculateSalary()
   {
      salary=annualSalary/12 - (annualSalary/12)*taxRate;
   }
   public String toString()
   {
	 DecimalFormat formatter = new DecimalFormat("#0.00");
     return super.toString() + "\n Tax paid =" + formatter.format((annualSalary/12)*taxRate);
   }
}