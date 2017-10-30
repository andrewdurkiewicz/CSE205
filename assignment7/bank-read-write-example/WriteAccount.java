import java.io.*;
import java.util.ArrayList;

public class WriteAccount
{
  public static void writeAccounts (ArrayList<BankAccount> b)
   {
      FileOutputStream fileOutput= null;
      ObjectOutputStream outStream = null;
      try
       {
         fileOutput = new FileOutputStream ("computer.data");
         outStream = new ObjectOutputStream (fileOutput);

        for(int i=0; i<b.size() ; i++)
        {
			outStream.writeObject(b.get(i));

		}

        }
       catch (NotSerializableException exception)
       {
          System.out.println("NotSerializableException");
       }
      catch (IOException exception)
       {
          System.out.println("IOExceotion");
        }
     finally
       {
            try
              {    if (outStream != null) outStream.close();    }
            catch (IOException exc)
               {   System.out.println(exc);      }
        }
	}
}

