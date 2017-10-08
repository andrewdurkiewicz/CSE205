
import java.util.ArrayList;
public class Bank
{
   public static void main(String[] args)
   {

       // Notice that the array list is of base class type

       ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
       SavingsAccount  s1= new SavingsAccount(1111, 500, 0.1);
       CheckingAccount  s2= new CheckingAccount(2222, 1000.00, 250.00);

       accounts.add(s1);
       accounts.add(s2);



       for(int i=0; i < BankAccount.numOfAccounts() ; i++)
       {
		   // Polymorphism is applied here as suitable
             // toString method is called depending on the              		  //account type
             System.out.println(accounts.get(i));
	   }




   }
}