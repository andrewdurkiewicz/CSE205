import java.util.ArrayList;
public class sortingArrayList
{
   public static void main(String[] args)
   {

       ArrayList<String> genes= new ArrayList<String>();

       genes.add("ATTBT");
       genes.add("CTTBT1TB");
       genes.add("1ATTBT");
       genes.add("ACTTBT");
       genes.add("Zasc5");


      Sorter.objsort(genes);
       for(int i=0 ; i<genes.size(); i++)
       {
          System.out.println(genes.get(i));
       }

     ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
     accounts.add(new BankAccount(10000));
     accounts.add(new BankAccount(0));
     accounts.add(new BankAccount(2000));

       Sorter.objsort(accounts);
	        for(int i=0 ; i<accounts.size(); i++)
	        {
	           System.out.println(accounts.get(i));
       }





   }
}