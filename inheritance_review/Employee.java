import java.util.*;
import java.lang.*;
import java.io.*;
public class Employee
{
	String name;
	double salary;
	double rate;
	int hours;
	private Monthly mpaid;
	private Hourly hpaid;
	public Employee()
	{
		this.name = name;
		this.salary = salary;
		this.rate = rate;
		this.hours = hours;
		this.hpaid = new Hourly();
	}

	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		this.mpaid = new Monthly();

	}
	public Employee(String name, double rate, int hours)
	{
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		this.hpaid = new Hourly();

	}
	public void calculateSalary(String name, double salary)
	{
		mpaid.Findmonthly(name, salary);
	}
	public void calculateSalary(String name, double rate, int hours)
	{
		hpaid.Findhourly(name, rate, hours);
	}
	public String toString()
	{


		return name + " has a current monthly salary of "+ mpaid.toString();

	}
}