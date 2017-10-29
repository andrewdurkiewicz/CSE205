import java.io.*;
import java.util.ArrayList;

public class readPhoneAcct
{
	public static ArrayList<phoneRecord> LoadPhoneAcct()
	{
		String filename = "phoneCalls.txt";
		FileInputStream file = null;
		ObjectInputStream inStream = null;
		Object obj1 = null;
		ArrayList<phoneRecord> custList = new ArrayList<phoneRecord>();

		try
		{
			file = new FileInputStream (filename);
			inStream = new ObjectInputStream (file);
			obj1 = inStream.readObject();

		}
		catch (FileNotFoundException exception)
     	{
      		System.out.println( filename + " was not found");
     	}
     	catch (IOException exception)
	    {
	       System.out.println("IOException has occurred.");
	    }

     	catch (ClassNotFoundException exception)
	    {
	      System.out.println( filename + " was not found");
     	}
     	try 
     	{
     		do
     		{
     			if (obj1 instanceof phoneRecord)
     			{
     				phoneRecord comp2 = (phoneRecord) obj1;
     				custList.add(comp2);
     			}
     			obj1 = inStream.readObject();
     		}
     		while( obj1 != null);
     	}

		catch (ClassNotFoundException exception)
		{
			System.out.println("Class was not found");
		}

		catch (FileNotFoundException exception)
		{
		System.out.println( filename + " was not found");
		}

		catch (IOException exception)
		{
		System.out.println("Done reading objects.");
		}

		System.out.println(custList.size());
		return custList;

     }
}