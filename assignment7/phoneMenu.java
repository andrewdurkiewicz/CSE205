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
				
				
				pm.listCallsMade();
				break;

				case 2:
				System.out.println("case2");
				break;

				case 3:
				System.out.println("case3");
				break;

				case 4:
				System.out.println("case 4");
				break;

				case 5:
				System.out.println("case 5");
				break;

				case 6:
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

	public static void listCallsMade()
	{
		cust.listCalls();
	}

}