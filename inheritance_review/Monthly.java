
import java.util.*;
import java.lang.*;
import java.io.*;
public class Monthly
{
	private String name;
	private double salary;
	private double msalary;

	public Monthly()
	{
		this.name = name;
		this.salary = salary;
	}


	public Monthly(String name, double salary)
	{
		this.name = name;
		this.salary = salary;

	}
	public void Findmonthly(String name, double salary)
	{
		this.name = name;
		this.salary = salary/12;
	}
	public String toString()
	{
		String numtostring = Double.toString(salary);

		return numtostring;

	}



}