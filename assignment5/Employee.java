public class Employee extends People
{
	protected int payScale;

	public Employee(String fName, String lName, String phone,int payScale,double rate)
	{
		super(fName,lName,phone);
		payScale = 0;



	}
}