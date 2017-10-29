import java.io.*;
public class phoneRecord implements Serializable
{
	private String destNum;
	private String date;
	private String name;
	private int duration;
	private double cost;

	public phoneRecord()
	{
		destNum = "";
		date = "";
		name = "";
		duration = 0;
		cost = 0.0;
	}

	public phoneRecord(String destination, int dur, String date_comp, String cust_name, double tot_cost)
	{
		this.destNum = destination;
		this.date = date_comp;
		this.duration = dur;
		this.name = cust_name;
		this.cost = tot_cost;

	} 

	public String getDestNum()
	{
		this.destNum = destNum;
		return destNum;

	}
	public int getDuration()
	{
		this.duration = duration;
		return duration;
	}
	public double getCost()
	{
		this.cost = cost;
		return cost;
	}

	public String toString()
	{
		return "Destination Number: "+destNum + " | Date: " + date + " | Duration (min): " + duration + " | Name: " + name + " | Cost: $" + cost;
	}



}