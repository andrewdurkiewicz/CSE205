import java.util.ArrayList;
import java.text.NumberFormat;

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
		monthlyPay =  payRate/(1.0*payScale) + 500.0*classesTeach.size();
	}
	public String toString()
	{
		monthlyPay = payRate/(1.0*payScale) + 500.0*classesTeach.size();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return first_name + " " + last_name + " | Teaching: " + classesTeach + " | Salary: " + formatter.format(monthlyPay);
	}
}