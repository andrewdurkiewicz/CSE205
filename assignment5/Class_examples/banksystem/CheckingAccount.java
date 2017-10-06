public class CheckingAccount extends BankAccount
{
   private double dailyLimit;


   public CheckingAccount()
   {
      super();
     dailyLimit=500.00;

   }

     public CheckingAccount(int actNum, double bal, double daily)
     {
       //super(actNum, bal);
       super();
       dailyLimit=daily;

     }


      public void withdraw(double withDrawAmt)
       {
          if(withDrawAmt<=balance && dailyLimit>=withDrawAmt)
          balance -=withDrawAmt;
       }

      public String toString()
       {
          return "Account "  + accountNumber + " has $" + balance + "  Blance" + " and your dialy limit is " + dailyLimit;
          //return super.toString() + " and your dialy limit is " + dailyLimit;

       }


  }

