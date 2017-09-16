import java.util.*;
import java.lang.*;
import java.io.*;
public class Hourly
{
	private double rate;
	private int hours;
	private String name;
	private double salary;

	public Hourly()
	{
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	public Hourly(String name, double rate, int hours)
	{
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	public void Findhourly(String name, double rate, int hours)
	{
		this.salary = rate * hours;
	}

	public String toString()
	{
		String numtostring = Double.toString(salary);

		return numtostring;

	}
}

