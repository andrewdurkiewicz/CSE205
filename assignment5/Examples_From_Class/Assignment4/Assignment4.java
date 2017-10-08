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
       String first_name, last_name, address;
       int age;
       double baseSalary;
       
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
           choice = line.charAt(0);
           choice = Character.toUpperCase(choice);

           // matches one of the case statement
           switch (choice)
            {
             case 'A':   //Add an employee
               /*read first_name, last_name, age, address, base salary
                  then call the appropriate methods of the employee instance e1 to
                  set those values */
            	 System.out.println("Enter first name: ");
            	 first_name = scan.nextLine();
            	 
            	 System.out.println("Enter last name: ");
            	 last_name = scan.nextLine();
            	 
            	 e1.setName(first_name, last_name);
            	 
            	 System.out.println("age: ");
            	 age = scan.nextInt();
            	 
            	 e1.setAge(age);
            	 
            	 System.out.println("Salary: ");
            	 baseSalary = scan.nextDouble();
            	 
            	 e1.setBaseSalary(baseSalary);
            	 
            	 System.out.println("Enter Address");
            	 scan.nextLine();
            	 
            	 System.out.println("\t Street name: ");
            	 String  street = scan.nextLine();
            	 
            	 System.out.println("\t City: ");
            	 String city = scan.nextLine();
            	 
            	 System.out.println("\t State: ");
            	 String state = scan.nextLine();
            	 
            	 System.out.println("\t zipcode: ");
            	 int zipcode = scan.nextInt();
            	 
            	 e1.setAddress(street, city, state, zipcode);
            	 scan.nextLine();

               break;
             case 'D':   //Display Employee
               System.out.print(e1);
               break;

             case 'C': // change address
                  /* read street name, city, state, zipcode and call appropriate
                     methods of e1 to change the address */
                 System.out.println("Enter New Address");
            	 
            	 System.out.println("\t Street name: ");
            	 street = scan.nextLine();
            	 
            	 System.out.println("\t City: ");
            	 city = scan.nextLine();
            	 
            	 System.out.println("\t State: ");
            	 state = scan.nextLine();
            	 
            	 System.out.println("\t zipcode: ");
            	 zipcode = scan.nextInt();
            	 
            	 e1.setAddress(street, city, state, zipcode);
            	 scan.nextLine();

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
