import java.text.DecimalFormat;
public class hourlyPaidEmp extends Employee
{
   private double hourlyRate;
   private int hoursWorked;

   public hourlyPaidEmp(String name, double hourlyRate, int hoursWorked)
   {
     super(name);
     this.hourlyRate=hourlyRate;
     this.hoursWorked=hoursWorked;
   }

   public void calculateSalary()
   {
      salary=hoursWorked*hourlyRate - (hoursWorked*hourlyRate)*taxRate;
   }

    public String toString()
      {
   	 DecimalFormat formatter = new DecimalFormat("#0.00");
        return super.toString() + "\n Tax paid =" + formatter.format((hoursWorked*hourlyRate)*taxRate);
   }

}