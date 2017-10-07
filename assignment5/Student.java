public class Student extends People
{
	private String major;
	private double gpa;

	public Student(String first_name, String last_name, String phoneNumber, String major)
	{
		super(first_name,last_name,phoneNumber);
		this.major = major;
		this.gpa = 0.0;

	}
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	public void changeMajor(String choice)
	{
		this.major = choice;

	}
	public String toString()
	{
		return super.toString() + " | " + major + "GPA: " + gpa;

	}
}