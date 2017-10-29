import java.io.*;
import java.util.ArrayList;
public class ReadAccount
{
  public static ArrayList<BankAccount> LoadAccounts()
   {
    String filename = "computer.data";
    FileInputStream file = null;
    ObjectInputStream inStream = null;
    Object obj1=null;
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    try
     {
       file = new FileInputStream (filename);
       inStream = new ObjectInputStream (file);
       obj1= inStream.readObject();

     }catch (FileNotFoundException exception)
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


       // Deserialize the objects
    try{

      do
      {

	  if (obj1 instanceof BankAccount)
	          {
	              BankAccount   comp2 = (BankAccount) obj1;
                  accounts.add(comp2);
	               // Print the object
	               //System.out.println (comp2);
          }



		 obj1 = inStream.readObject();

     } while(obj1 !=null);
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

       System.out.println(accounts.size());
       return accounts;  }


}
