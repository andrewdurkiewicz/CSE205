import java.util.ArrayList;
import java.text.DecimalFormat;

public class Faculty extends Employee
{
	private String department;
	private ArrayList<String> classesTeach = new ArrayList<String>();

	public Faculty(String first_name, String last_name, String phoneNumber, double payRate, int payScale, String department)
	{
		super(first_name,last_name,phoneNumber,payScale,payRate);
		this.department = department; 
	}

	public void addClass(String newClass)
	{
		this.classesTeach = classesTeach;
		classesTeach.add(newClass);
	}

	public void calculatePay()
	{
		this.classesTeach = classesTeach;
		monthlyPay =  (payRate/payScale) + 500*classesTeach.size();
	}
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return "\n\n" + first_name + " " + last_name + " | Teaching: " + classesTeach + " | Salary: " + formatter.format(monthlyPay);
	}
}