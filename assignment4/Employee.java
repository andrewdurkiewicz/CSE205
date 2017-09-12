import java.util.*;

public class Employee
{
	private String first_name, last_name, address, age, salary;
	public Employee(String first_name, String last_name, String address, String age, String salary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.age = age;
		this.salary = salary;
		
	}
	public Employee(){
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public void setEmployeeInfo(String first_name, String last_name, String address, String age, String salary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public String toString()
	{
		return "\n Employee " + first_name + " " + last_name + ", aged " 
				+ age + ", lives at: " + address + 
				" and currently makes " + salary + " a year.";
	}
}
