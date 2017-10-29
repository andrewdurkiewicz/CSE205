import java.io.*;
import java.util.*;

public class readPhoneAcct
{
	public static ArrayList<phoneRecord> readFile()
	{
		ArrayList<phoneRecord> custList = new ArrayList<phoneRecord>();
		Scanner x = new Scanner(System.in);

		try{
			x = new Scanner(new File("phoneCalls.txt"));
		}
		catch(Exception e){
			System.out.println("Can't find file");
		}
		while(x.hasNextLine())
		{
			String a = x.nextLine();
			String[] b = a.split("/");
			String phone = b[0];
			int duration = Integer.parseInt(b[1]);
			String date = b[2];
			String name = b[3];
			double cost = Double.parseDouble(b[4]);


			phoneRecord c = new phoneRecord(phone,duration, date, name, cost);
			custList.add(c);

		}
		return custList;

	}


}