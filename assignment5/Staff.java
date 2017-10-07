import java.text.NumberFormat;
public class Staff extends Employee
{
	private String title;

	public Staff(String first_name ,String last_name,String phoneNumber,double payRate,int payScale,String title)
	{
		super(first_name, last_name, phoneNumber, payScale, payRate);
		this.title = title;
	}

	public String toString()
	{
		double sal = ((double) payRate)/(payScale);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return  first_name + " " + last_name + " | Title: " + title + "| Salary: " + formatter.format(sal);
	
	}

	public void calculatePay()
	{
		monthlyPay = payRate/(1.0*payScale);
	}
}