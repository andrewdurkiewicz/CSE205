import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.text.NumberFormat;


public class Customer
{
	ArrayList<phoneRecord> customers;
	ArrayList<Integer> durations;
	PrintWriter writer;
	NumberFormat format;
	public Customer()
	{
		//customers = new ArrayList<phoneRecord>();
		customers = new ArrayList<phoneRecord>();
		customers = readPhoneAcct.readFile();
	}

	public void findInstance(String inputInQuestion)
	{
		for(int i = 0; i<customers.size();i++)
		{
			if(customers.get(i).getDestNum().compareTo(inputInQuestion)==0)
			{
				System.out.println("======================");
				System.out.println("There is a match: \n");
				System.out.println(customers.get(i));
				System.out.println("======================");
				System.out.println("\n");
			}
			else if(i == customers.size()-1)
			{
				System.out.println("===============");
				System.out.println("No Match\n");
				System.out.println("===============");

			}


		}

	}
	public void findLongestCall()
	{
		durations = new ArrayList<Integer>();

		for(int i = 0; i<customers.size();i++)
		{
			durations.add(customers.get(i).getDuration());

		}
		Collections.sort(durations);

		for(int i = 0; i<customers.size();i++)
		{ 
			if(customers.get(i).getDuration() == durations.get(durations.size()-1))
			{
				System.out.println("======================");
				System.out.println("Longest call duration: \n");
				System.out.println(customers.get(i));
				System.out.println("======================");
				System.out.println("\n");

			}
	}}

	public void findShortestCall()
	{
		durations = new ArrayList<Integer>();

		for(int i = 0; i<customers.size();i++)
		{
			durations.add(customers.get(i).getDuration());

		}
		Collections.sort(durations);

		for(int i = 0; i<customers.size();i++)
		{ 
			if(customers.get(i).getDuration() == durations.get(0))
			{
				System.out.println("======================");
				System.out.println("Shortest call duration: \n");
				System.out.println(customers.get(i));
				System.out.println("======================");
				System.out.println("\n");

			}
	}}

	public void sortCallsDuration()
	{
		durations = new ArrayList<Integer>();

		for(int i = 0; i<customers.size();i++)
		{
			durations.add(customers.get(i).getDuration());

		}
		Collections.sort(durations);
		for(int i = 0; i <durations.size();i++)
		{
			for(int j = 0; j<customers.size();j++)
			{
				if(durations.get(i) == customers.get(j).getDuration())
				{
					System.out.println(customers.get(j));
				}

			}
		}
	
	}
	public void finalizeBill()
	{
		try{
		PrintWriter writer = new PrintWriter("phone_bills.txt", "UTF-8");
		double sum = 0.0;
		for (int i = 0; i< customers.size(); i++)
		{
			sum = sum + customers.get(i).getCost();
			writer.println(customers.get(i));
		}
		NumberFormat formatter = NumberFormat.getCurrencyInstance();


		writer.println(formatter.format(sum));
		writer.close();
	}
	catch (FileNotFoundException exception)
     {
      System.out.println( "file was not found");
     }
     catch (IOException exception)
	      {
	       System.out.println("IOException has occurred.");
	      }


	   
     }


	}


	
