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
             	String age = scan.next();

             	System.out.print("Enter Salary: ");
             	String salary = scan.next();

             	System.out.print("What is the Address?\nStreet Name: ");
             	String street_name = scan.nextLine();
              scan.next();

             	System.out.print("City: ");
             	String city = scan.next();

             	System.out.print("State: ");
             	String state = scan.next();

             	System.out.print("Zipcode: ");
             	String zip = scan.next();

             	//return full address as a string:
             	String address = street_name + " | " + city + "," + " " + state + " " + zip;
             	e1.setEmployeeInfo(first_name, last_name, address, age, salary);

             	

               //Add an employee
               /*read first_name, last_name, age, address, base salary
                  then call the appropriate methods of the employee instance e1 to
                  set those values */


               break;
             case 'D':   //Display Employee
               System.out.print(e1);
               break;

             case 'C': // change address
                  /* read street name, city, state, zipcode and call appropriate
                     methods of e1 to change the address */


             break;

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
           System.out.print("Unknown action\n");
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

