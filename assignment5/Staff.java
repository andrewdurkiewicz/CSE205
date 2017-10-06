public class Staff extends Employee
{
	private String title;

	public Staff(String fName,String lName,String phone,double rate,int scale,String title)
	{
		super(fName, lName, phone, scale, rate);
		this.title = title;
	}

	public String toString()
	{
		return first_name+last_name;
	}

	public void calculatePay()
	{
		return payRate/payScale;
	}
}