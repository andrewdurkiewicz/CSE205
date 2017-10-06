import java.util.*;
public class University {

	public static void main(String args[])
	{
		String univ_Name, location;
		ArrayList<People> people = new ArrayList<People>();
		char choice = 'A';
		String line;
		Scanner scan = new Scanner(System.in);
		// read the name and the location of the university here


	do{
		System.out.print("What action would you like to perform?\n");
        printMenu();
        line = scan.nextLine();

        if (line.length() == 1)
         {
          choice = line.charAt(0);
          choice = Character.toUpperCase(choice);

		switch(choice)
		{
		case 'A':
			// add a Student here
			/* read the first name, last name, phone number, major as parameters and then call the
			 * constructor of the Student class to create the instance
			 * then read the gpa, call setGpa method of the student to set the gpa
			 * finally add the student instance to the people list
			 */

			break;
		case 'B':
			// add a Staff here
			/* read the first name, last name, phone number, payRate, payScale, and title and then call the
			 * constructor of the Staff class to create the instance
			 * finally add the Staff instance to the people list
			*/



			break;
		case 'C':
			// add a Faculty here
			/* read the first name, last name, phone number, payRate, payScale, and department and then call the
			 * constructor of the Faculty class to create the instance
			 * read list of courses the instructor read and call the addClass method
			 * of the faculty to add classes
			 * finally add the Faculty instance to the people list
			*/


			break;

		case 'D':
			// display university info
			/* university name, location, number of students, number of faculty and number of
			 *staff
			 */


			break;
		case 'E':
			// display people info
			/* display the fist name and the last name of each person at school
			 *
			 */


			break;

		case 'F':
			// display Student info
			/* display fist name, last name, and the major of each student
			 * java has a construct called instanceof. That construct can determine
			 * the object instance type
			 * example:
			 *  String str = new String("hello");
			 *  if(str instanceof String) will be evaluated to true
			 */

			break;

		case 'G':
			// display Employee info
			/* display fist name, last name, pay rate, and monthly pay of each employee
			 *
			 */

			break;

		case 'Q':
			// quit the program

			break;
		case '?':
			// display the menu again

			break;

		default:
			System.out.println("default");




		}


         } else
		     {
        	     System.out.print("Unknown action\n");
		     }

		}while(choice != 'Q');


	}
	 public static void printMenu()
	   {
	     System.out.print("Choice\t\tAction\n" +
	                        "------\t\t------\n" +
	                        "A\t\tAdd a Student\n" +
	                        "B\t\tAdd a Staff\n" +
	                        "C\t\tAdd a Faculty\n"+
	                        "D\t\tDisplay University  Info\n" +
	                        "E\t\tDisplay University People Info\n" +
	                        "F\t\tDisplay University Student Info\n" +
	                        "G\t\tDisplay University Employee Info\n" +
	                        "Q\t\tQuit\n" +
	                        "?\t\tDisplay Menu Again\n\n");
	  }

}
