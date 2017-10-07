import java.util.*;
public class University {

	public static void main(String args[])
	{
		String univ_Name, location, first_name, last_name, phoneNumber, title, major, department, course;
		double gpa, payRate;
		int payScale;
		ArrayList<People> people = new ArrayList<People>();
		char choice = 'A';
		String line;
		Scanner scan = new Scanner(System.in);
		// read the name and the location of the university here
		System.out.print("What is the University Name: ");
		univ_Name = scan.nextLine();

		System.out.print("Where is it located: ");
		location = scan.nextLine();


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
        	 System.out.println("Enter first name: ");
        	 first_name = scan.nextLine();
        	 
        	 System.out.println("Enter last name: ");
        	 last_name = scan.nextLine();

        	 System.out.println("Enter phone number: ");
        	 phoneNumber = scan.nextLine();

        	 System.out.println("Enter major: ");
        	 major = scan.nextLine();

        	 Student s1 = new Student(first_name,last_name,phoneNumber,major);

        	 System.out.println("What is their GPA: ");
        	 gpa = scan.nextDouble();

        	 s1.setGPA(gpa);
        	 people.add(s1);


			// add a Student here
			/* read the first name, last name, phone number, major as parameters and then call the
			 * constructor of the Student class to create the instance
			 * then read the gpa, call setGpa method of the student to set the gpa
			 * finally add the student instance to the people list
			 */

			break;
		case 'B':
        	 System.out.println("Enter first name: ");
        	 first_name = scan.nextLine();
        	 
        	 System.out.println("Enter last name: ");
        	 last_name = scan.nextLine();

        	 System.out.println("Enter phone number: ");
        	 phoneNumber = scan.nextLine();

        	 System.out.println("Enter pay rate (Example: 10.23): ");
        	 payRate = scan.nextDouble();

        	 System.out.println("Enter pay scale (9 or 12 months): ");
        	 payScale = scan.nextInt();

             System.out.println("Enter title: ");
        	 title = scan.nextLine();

        	 Staff staff1 = new Staff(first_name,last_name,phoneNumber,payRate, payScale, title);
        	 people.add(staff1);

			// add a Staff here
			/* read the first name, last name, phone number, payRate, payScale, and title and then call the
			 * constructor of the Staff class to create the instance
			 * finally add the Staff instance to the people list
			*/



			break;
		case 'C':
			 System.out.println("Enter first name: ");
        	 first_name = scan.nextLine();
        	 
        	 System.out.println("Enter last name: ");
        	 last_name = scan.nextLine();

        	 System.out.println("Enter phone number: ");
        	 phoneNumber = scan.nextLine();

        	 System.out.println("Enter pay rate (Example: 10.23): ");
        	 payRate = scan.nextDouble();

        	 System.out.println("Enter pay scale (9 or 12 months): ");
        	 payScale = scan.nextInt();

        	 System.out.println("Enter the department: ");
        	 department = scan.nextLine();

        	 Faculty f1 = new Faculty(first_name,last_name,phoneNumber,payRate, payScale,department);
        	 scan.nextLine();

        	 System.out.println("Enter the faculty course: ");
        	 course = scan.nextLine();

        	 f1.addClass(course);
        	 people.add(f1);
			// add a Faculty here
			/* read the first name, last name, phone number, payRate, payScale, and department and then call the
			 * constructor of the Faculty class to create the instance
			 * read list of courses the instructor read and call the addClass method
			 * of the faculty to add classes
			 * finally add the Faculty instance to the people list
			*/


			break;

		case 'D':
			int st = 0;
			int s = 0;
			int f = 0;
			for(int i = 0; i<people.size(); i++)
			{
				if(people.get(i) instanceof Student)
				{
					st++;
				}
				if(people.get(i) instanceof Staff)
				{
					s++;
				}

				if(people.get(i) instanceof Faculty)
				{
					f++;
				}
			}
			System.out.println("University: " + univ_Name + " | Location: " + location + " | Students: " + st + " | Staff: " + s + " | Faculty: " + f);
			// display university info
			/* university name, location, number of students, number of faculty and number of
			 *staff
			 */


			break;
		case 'E':
			people.getName();
			// display people info
			/* display the fist name and the last name of each person at school
			 *
			 */


			break;

		case 'F':
			int stud_count = 1;
			for(int i = 0; i<people.size(); i++)
			{
				if(people.get(i) instanceof Student)
				{
					System.out.println("Student " + stud_count +": " + people.get(i));
					stud_count++
				}
			}

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
			int emp_count = 1;
			for(int i = 0; i<people.size(); i++)
			{
				if(people.get(i) instanceof Staff || people.get(i) instanceof Faculty)
				{
					System.out.println("Employee " + emp_count +": " + people.get(i));
					emp_count++;
				}
			}
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
