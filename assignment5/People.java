public class People 
{
	protected String first_name;
	protected String last_name;
	protected String phoneNumber;
	protected double payRate;
	protected double monthlyPay;

	public People(String fName, String lName, String phone)
	{
		first_name = fName;
		last_name = lName;
		phoneNumber = phone;
		payRate = 0.0;

	}

	public calculatePay()
	{
		monthlyPay = 0.0;

	}

	public String getName()
	{
		return first_name + " " + last_name;
	}

	public String toString()
	{
		return first_name + " " + last_name + "| Phone: " + phoneNumber;
	}


}