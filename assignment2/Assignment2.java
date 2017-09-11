
/*Andrew Durkiewicz
Homework 2
CSE 205
ASU*/

/*Please note, this was written on Ubuntu 16.04. Being my first
Java course, I am actually unsure if there will be any conflicts
with the software. It works perfectly on my computer*/
import java.util.*;
public class Assignment2{

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int test1 = 0;
    	int test2 = 0;
    	String brand = "";
    	long card = 0;

   		while(test1 == 0){
	    	try{
				System.out.println("Enter the card number: ");
				card = scan.nextLong();
				int length = (int) (Math.log10(card)+1);
				if (length != 16){
					throw new EmptyStackException();
				}
				else{
					test1+=1;

				}
			}
			catch (Exception e){
	    		System.out.println("Error: Must be 16 digits. Please try again:");
	    		scan.next();
	    	}
	    }
		while(test2==0){
	    	try{
		    	System.out.println("Enter the card type :  ");
				brand = scan.next();

				if (brand.equals("Visa") == true || brand.equals("Master") == true){
					test2+=1;
				}
				else{
					throw new EmptyStackException();
				}
	    	}

	    	catch (Exception e){
	    		System.out.println("Error: We only accept Visa or MasterCard. Please try Again:");
	    	}
		}

    	long testvalid = card;
    	long sum = 0;
		while (testvalid >0){
			sum = sum + (testvalid %10);
			testvalid = testvalid/10;
		}

		if (brand.equals("Visa") == true){
			if (sum%10 == 0){
				System.out.println("This is a valid " + brand + " card");
			}
			else{
				System.out.println("This is not a valid " + brand +" card");
			}
		}

		if (brand.equals("Master") == true){
			if (sum%10 == 1){
				System.out.println("This is a valid " + brand + " card");
			}
			else{
				System.out.println("This is not a valid " + brand +" card");
			}
		}
	}
}