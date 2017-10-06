public class Student extends People
{
	private String major;
	private double gpa;

	public Student(String first_name, String last_name, String phoneNumber, String major)
	{
		super(first_name,last_name,phoneNumber);
		this.major = major;
		gpa = 0.0;

	}
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	public void changeMajor(String)
	{
		this.major = major;

	}
	public String toString()
	{
		return first_name+last_name+phoneNumber+major+gpa;

	}
}