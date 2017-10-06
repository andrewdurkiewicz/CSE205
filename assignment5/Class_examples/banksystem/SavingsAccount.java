public class SavingsAccount extends BankAccount
{

   private double interestRate;

     public SavingsAccount()
     {
       super();
       interestRate=0.0;

     }

       public SavingsAccount(int actNum, double bal, double interestRate)
       {
         super(actNum, bal);
         this.interestRate=interestRate;

       }

         public String toString()
         {
            return "Account "  + accountNumber + " has $" + balance + "  Blance" + " and your interest rate is " + interestRate;

       }

}