import java.util.ArrayList;

public class Customer
{
	ArrayList<phoneRecord> custList;
	public Customer()
	{
		custList = new ArrayList<phoneRecord>();
		custList = readPhoneAcct.LoadPhoneAcct();
	}

	public void listCalls()
	{
		for(int i = 0; i<custList.size(); i++)
		{
			System.out.println(custList.get(i));
		}
	}
	
}