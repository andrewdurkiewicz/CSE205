import java.util.*;

public class Employee
{
	private String first_name, last_name;
	private int age;
	private double baseSalary;
	private Address address;

	public Employee(String first_name, String last_name, String age, double baseSalary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.baseSalary = baseSalary;
		this.address = new Address()
		
	}
	public Employee(){
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.baseSalary = baseSalary;
	}
	public void setEmployeeInfo(String first_name, String last_name, String age, double baseSalary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.baseSalary = baseSalary;
	}
	public String toString()
	{
		return "nothing";
	}
}
