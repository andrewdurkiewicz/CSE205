import java.text.DecimalFormat;
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
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return "\n\n" + first_name + " " + last_name + " | Title: " + title + "| Salary: " + formatter.format(monthlyPay);
	
	}

	public void calculatePay()
	{
		monthlyPay = payRate/payScale;
	}
}