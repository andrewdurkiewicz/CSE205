import java.util.ArrayList;
public class Sorter
{
  // selection sort for an arrayList of Strings
  public static void sort(ArrayList<String> a)
  {

         	String smallest;
    		int smallestIndex=0;


    		for (int currentLocation = 0; currentLocation < a.size(); currentLocation++) {


    			smallest = a.get(currentLocation);
    			smallestIndex = currentLocation;

				//find smallest
    			for (int i = currentLocation + 1; i < a.size(); i++) {
    				if (smallest.compareTo(a.get(i))>0) {

    					smallest = a.get(i);
    					smallestIndex = i;
    				}
    			}
				//swat
    			if (currentLocation != smallestIndex)
    			{
    				String temp = a.get(currentLocation);
    				a.set(currentLocation, a.get(smallestIndex));
    				a.set(smallestIndex, temp);
    			}

		}


  }

   // selection sort for an arrayList of objects
  public static void objsort(ArrayList a)
    {

      		if(a.get(0) instanceof String)
      		{
      		String smallest="";
      		int smallestIndex=0;


      		for (int currentLocation = 0; currentLocation < a.size(); currentLocation++) {

      			smallest = (String) a.get(currentLocation);
      			smallestIndex = currentLocation;

				//find smallest
      			for (int i = currentLocation + 1; i < a.size(); i++) {
      				if (smallest.compareTo((String)a.get(i))>0) {

      					smallest = (String)a.get(i);
      					smallestIndex = i;
      				}
      			}

      			// swap
              if (currentLocation != smallestIndex)
    			{
      				String temp = (String)a.get(currentLocation);
      				a.set(currentLocation, (String)a.get(smallestIndex));
      				a.set(smallestIndex, temp);
      			}

  		}} else if(a.get(0) instanceof BankAccount)
		      		{
		      		BankAccount smallest;
		      		int smallestIndex=0;

		      		for (int currentLocation = 0; currentLocation < a.size(); currentLocation++) {


		      			smallest = (BankAccount) a.get(currentLocation);
		      			smallestIndex = currentLocation;

						//find smallest
		      			for (int i = currentLocation + 1; i < a.size(); i++) {
		      				if (smallest.compareTo((BankAccount)a.get(i))>0) {

		      					smallest = (BankAccount)a.get(i);
		      					smallestIndex = i;
		      				}
		      			}

					// swap
		      		if (currentLocation != smallestIndex)
    					{
		      				BankAccount temp = (BankAccount)a.get(currentLocation);
		      				a.set(currentLocation, (BankAccount)a.get(smallestIndex));
		      				a.set(smallestIndex, temp);
		      			}

  		}

    }




  }

}