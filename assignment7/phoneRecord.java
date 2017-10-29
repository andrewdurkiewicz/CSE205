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
		destNum = destination;
		date = date_comp;
		duration = dur;
		name = cust_name;
		cost = tot_cost;

	} 

}