import java.util.*;

public class Employee
{
	private String first_name, last_name;
	private int age;
	private double baseSalary;
	private Address address;

	public Employee()
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.baseSalary = baseSalary;
		this.address = new Address();

	}
	public String getName()
	{
		this.first_name = first_name;
		this.last_name = last_name;
		return first_name + " " + last_name;
	}
	public String getSalary()
	{
		this.baseSalary = baseSalary;
		return Double.toString(baseSalary);
	}
	public Address getAddress()
	{
		this.address = address;
		return address;
	}
	public void setName(String first_name, String last_name)
	{
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	public void setAddress(String streetname, String city, String state, int zipcode)
	{
		address.changeAddress(streetname, city, state, zipcode);

	}
	public String toString()
	{
		return "Employee Name: " + getName() + " | Age: " + age + " | Annual Salary: $" + getSalary() + "\n" + getAddress();
	}
}