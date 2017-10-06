public class Faculty extends Employee
{
	private String department;
	private ArrayList<String> classesTeach = new ArrayList<String>();

	public Faculty(String fname, String lname, String phone, double rate, double scale, String department)
	{
		super(fname,lname,phone,payScale,rate);
		this.department = department; 
	}

	public void addClass(String newClass)
	{
		classesTeach.add(newClass);
	}

	public void calculatePay()
	{
		return (payRate/payScale) + 500*classesTeach.size();
	}
	public String toString()
	{
		return first_name+last_name+classesTeach;
	}
}