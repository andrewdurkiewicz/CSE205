public class People 
{
	protected String first_name;
	protected String last_name;
	protected String phoneNumber;
	protected double payRate;
	protected double monthlyPay;

	public People(String first_name, String last_name, String phoneNumber)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneNumber = phoneNumber;
		this.monthlyPay = monthlyPay;
		this.payRate = payRate;
	}


	public String getName()
	{
		return first_name + " " + last_name;
	}

	public String toString()
	{
		return getName() + " | Phone: " + phoneNumber;
	}


}