import java.util.ArrayList;

public class Faculty extends Employee
{
	private String department;
	private ArrayList<String> classesTeach;

	public Faculty(String fname, String lname, String phone, double rate, int scale, String department)
	{
		super(fname,lname,phone,scale,rate);
		this.department = department; 
	}

	public void addClass(String newClass)
	{
		classesTeach.add(newClass);
	}

	public void calculatePay()
	{
		monthlyPay =  (payRate/payScale) + 500*classesTeach.size();
	}
	public String toString()
	{
		return first_name+last_name+classesTeach;
	}
}