import java.util.ArrayList;

public class Faculty extends Employee
{
	private String department;
	private ArrayList<String> classesTeach;

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
		return first_name + " " + last_name + "| Phone: " + phoneNumber + classesTeach + monthlyPay;
	}
}