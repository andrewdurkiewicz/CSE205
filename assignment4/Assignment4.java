// Assignment : Arizona State U. CSE205 #4
// Name: Your name
// StudentID: Your ID
// Lecture: Your section
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.
// Time spent:


import java.util.*;

public class Assignment4
 {
  public static void main (String[] args)
   {
       // local variables, can be accessed anywhere from the main method


       char choice = 'Q';
       String line = new String();

       // instantiate a Employee object
       Employee e1 = new Employee();



       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);


       do  // will ask for user input
        {


         System.out.print("What action would you like to perform?\n");
         printMenu();
         line = scan.nextLine();

         if (line.length() == 1)
          {
		   // get the choice as a character
           choice = line.charAt(0);
           choice = Character.toUpperCase(choice);

           // matches one of the case statement
           switch (choice)
            {
             case 'A': 
             	System.out.print("Enter First Name: ");
             	String first_name = scan.next();

             	System.out.print("Enter Last Name: ");
             	String last_name = scan.next();

             	System.out.print("Enter Age: ");
             	int age = scan.nextInt();

             	System.out.print("Enter Salary: ");
             	double baseSalary = scan.nextDouble();

             	System.out.print("Current Street Address: ");
              //I had to do this, scan.next was buggy. wouldn't scan the whole line
              String streetNum = scan.next();
             	String streetsname = scan.nextLine();
              String street_name = streetNum + streetsname;

             	System.out.print("City: ");
             	String city = scan.next();

             	System.out.print("State: ");
             	String state = scan.next();

             	System.out.print("Zipcode: ");
             	int zip = scan.nextInt();

             	//return full address as a string:
              e1.setName(first_name,last_name);
              e1.setAge(age);
              e1.setBaseSalary(baseSalary);
             	e1.setAddress(street_name,city,state,zip);


               //Add an employee
               /*read first_name, last_name, age, addr;ess, base salary
                  then call the appropriate methods of the employee instance e1 to
                  set those values */


               break;
             case 'D':   //Display Employee
               System.out.print(e1);
               break;

             case 'C': 
               System.out.print("Please Note: You are preforming an address change for " + e1.getName() + "\n");
               System.out.print("The Current Address is listed as: " + e1.getAddress() + "\n");
               System.out.print("Do you wish to continue with the address update? Y/n: ");
               char answer = scan.next().charAt(0);
               if (answer == 'Y')
               {
               System.out.print("New Street Address: ");
               String street_numbers = scan.next();
               String street_letters = scan.nextLine();
               String change_street_name = street_numbers + street_letters;

               System.out.print("City: ");
               String change_city = scan.next();

               System.out.print("State: ");
               String change_state = scan.next();

               System.out.print("Zipcode: ");
               int change_zip = scan.nextInt();
               e1.setAddress(change_street_name,change_city,change_state, change_zip);
               break;
               }
               else
               {
                break;
               }





                  // change address
                  /* read street name, city, state, zipcode and call appropriate
                     methods of e1 to change the address */




             case 'Q':   //Quit
               break;

             case '?':   //Display Menu
               printMenu();

               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
          }

         else
          {
           System.out.print("Your action has been recorded.\n");
           System.out.print("------------------------------\n\n");
          }


        } while (choice != 'Q');
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd an Employee\n" +
                        "D\t\tDisplay an Employee Info\n" +
                        "C\t\tChange Address\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Menu Again\n\n");
  }
}

