public class Employee extends People
{
	protected int payScale;

	public Employee(String first_name, String last_name, String phoneNumber, int payScale, double payRate)
	{
		super(first_name,last_name,phoneNumber);
		this.payScale = payScale;

	}
}