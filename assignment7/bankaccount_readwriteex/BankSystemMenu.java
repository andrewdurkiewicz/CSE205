import java.util.Scanner;
public class BankSystemMenu
{


  private static Scanner scan = new Scanner(System.in);
  private static int option=0;
  private static BankSystem bc;

   public static void main(String args[])
   {
    BankSystemMenu bsm = new BankSystemMenu();
    int op=bsm.menu();
    while(op !=-1)
    {
    switch(op)
    {
		case 1:
		bsm.listBanks();
		break;

		case 3:
		bsm.add();
		break;

        case 5:
		bsm.save();
		break;

		default:
		System.out.println("not Implemented yet");
	}
      op=bsm.menu();
   }

   }

   public  static int menu()
   {

	         System.out.println("\n\n Welcome to CSE205 Banking System");
	         System.out.println("================================");


	         System.out.println("Please select one of the options below");
	         System.out.println("1. List available bank accounts");
	         System.out.println("2. Search bank account by number");
	         System.out.println("3. Add a bank account");
	         System.out.println("4. Delete an Account");
	         System.out.println("5. Save accounts to a file");
	         System.out.println("6. Quit");

     option = scan.nextInt();
     return option;

   }
   public BankSystemMenu()
   {
	   bc= new BankSystem();
   }

	public static void listBanks()
    {

		bc.listAccounts();

	}

	public static void add()
	{
		bc.addAccount();

	}

	public static void save()
	{
		bc.save();
	}




}