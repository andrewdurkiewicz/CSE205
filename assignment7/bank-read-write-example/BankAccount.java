import java.io.*;
public class BankAccount implements Serializable
{

   private int accountNumber;
   private double balance;

   public BankAccount()
   {
     accountNumber=0000;
     balance=0;

   }

     public BankAccount(int actNum, double bal)
     {
       accountNumber=actNum;
       balance=bal;

     }

     public void deposit(double depositAmt)
     {
       if(depositAmt>0)
       balance += depositAmt;
    }

      public void withDraw(double withDrawAmt)
       {
          if(withDrawAmt<=balance)
          balance +=withDrawAmt;
       }

       public String toString()
       {
          return "Account "  + accountNumber + " has $" + balance + "  Blance";

       }

  }