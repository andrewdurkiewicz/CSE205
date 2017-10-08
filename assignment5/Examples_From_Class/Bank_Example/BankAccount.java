public class BankAccount
{
     protected int accountNumber;
     protected double balance;
     protected static int numOfAccounts=0;


     public BankAccount()
     {
		 accountNumber=0000;
		 balance=0;
		 numOfAccounts++;
	 }


     public BankAccount(int actNum, double bal)
	 {
	        accountNumber=actNum;
	        balance=bal;
	        numOfAccounts++;

     }


     public static int numOfAccounts()
	 {
	          return numOfAccounts;


     }

       public double deposit(double depositAmt)
     {
       if(depositAmt>0)
       balance += depositAmt;

       return balance;
    }

      public void withdraw(double withDrawAmt)
       {
          if(withDrawAmt<=balance)
          balance -=withDrawAmt;

       }

       public String toString()
       {
		   return "Account "  + accountNumber + " has $" + balance + "  Blance ";
	   }

}