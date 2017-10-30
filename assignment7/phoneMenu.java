import java.util.Scanner;


public class phoneMenu
{
	private static Scanner scan = new Scanner(System.in);
	private static int option = 0;
	private static Customer cust;

	public static void main(String[] args)
	{
		phoneMenu pm = new phoneMenu();
		int op = pm.menu();
		while(op != -1)
		{
			switch(op)
			{
				case 1:
				
				System.out.println("What is the destination number you wish to inquire about? Enter in the form 'xxx-xxx-xxxx', x = number");
				String answer = scan.next();

				pm.listIfInstance(answer);
				break;

				case 2:
				pm.findLongest();
				break;

				case 3:
				pm.findShortest();
				break;

				case 4:
				pm.organizeSort();
				break;

				case 5:
				pm.bill();
				break;

				case 6:
				System.exit(0);
				break;
			}
			op = pm.menu();
		}


	}

	public static int menu()
	{
		System.out.println("Please select one of the options below");
		System.out.println("======================================");
		System.out.println("1. Search a call based on the destination number.");
		System.out.println("2. Display the longest call information.");
		System.out.println("3. Display the shortest call information.");
		System.out.println("4. Sort and display the phone calls based on the call duration.");
		System.out.println("5. Prepare the phone bill and output in phone_bills.txt.");
		System.out.println("6. Quit.");

		option = scan.nextInt();
		return option;


	}

	public phoneMenu()
	{
		cust = new Customer();
	}

	public static void listIfInstance(String newInstance)
	{

		cust.findInstance(newInstance);
	}

	public static void findLongest()
	{
		cust.findLongestCall();
	}
	public static void findShortest()
	{
		cust.findShortestCall();
	}
	public static void organizeSort()
	{
		cust.sortCallsDuration();
	}
	public static void bill(){
		cust.finalizeBill();
	}
}