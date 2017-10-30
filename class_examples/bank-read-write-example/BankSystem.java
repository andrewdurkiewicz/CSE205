import java.util.ArrayList;
public class BankSystem
{
   ArrayList<BankAccount> accounts;

   public BankSystem()
   {
	accounts = new ArrayList<BankAccount>();
	accounts=ReadAccount.LoadAccounts();

   }

   public void listAccounts()
   {
	  for(int i=0; i<accounts.size(); i++)
	  {
	     System.out.println(accounts.get(i));
	  }

   }

   public void addAccount()
   {
        BankAccount b = new BankAccount();
        b.deposit(400);
        accounts.add(b);
   }

   public void save()
   {
	 WriteAccount.writeAccounts(accounts);
   }


}