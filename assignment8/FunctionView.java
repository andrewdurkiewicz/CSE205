import java.util.*; 
import java.lang.*;
import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.Fidelity;

public class FunctionView {
	public static void main(String[] args) {
		//initialize the array. I am using an arraylist rather than a true
		//array since we were taught that arrayList allow for flexability in 
		//initializing their size. 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int condition = 1;
		System.out.println("Enter the integer values: (0 to finish)");
		int i = 0;
		while(condition!=0)
		{
			System.out.println("Index[" + i +"]: ");
			condition = scan.nextInt();
			if (condition == 0)
			{
				break;
			}
			numbers.add(condition);
			i++;
		}
		System.out.println("The Array to be analyzed is: " + numbers);
		System.out.println("The sum of the numbers at even indices is: " + computeSumAtEvenIndexes(numbers, 0));
		System.out.println("The number of odd integers within this list is: " + countOdd(numbers,0,numbers.size()));
		System.out.println("The minimum value in the list is: "+findMin(numbers, 0, numbers.size()));
		System.out.println("The number of '-1' instances is: " + countNegativeOne(numbers, 0));
		scan.close();



	}
	public static int computeSumAtEvenIndexes(ArrayList<Integer> arr, int index)
	{
		/*This function below, returns the ceiling function of the array size divided by 2.
		I do this because, it rounds the value up. This allows me to find the amount of even 
		indices, regardless of the initial length.*/
		int even_index_count = (int) Math.ceil((double) arr.size()/2.0);
		if(index >= 2*even_index_count)
		{
			//we have gone past our last even index. Basically, this stops 
			//the recursion from being infinite. Which would cause an outOfRange error. 
			//so we return 0:
			return 0;
		}
		else
		{
			return (int) arr.get(index) + (int) computeSumAtEvenIndexes(arr,index+2);
		}
		
	}
	public static int countOdd(ArrayList<Integer> arr,int startIndex,int endIndex)
	{
		double checkOdd = Math.floor(Math.abs((double) arr.get(startIndex)%2.0));
		if (startIndex < endIndex-1)
		{
			return Math.abs((int)checkOdd) + Math.abs((int)countOdd(arr, startIndex + 1, endIndex));
		}
		else
		{
			return (int)0.0;
		}
		
	}
	public static int findMin(ArrayList<Integer> arr, int startIndex, int endIndex)
	{
		while(arr.size()!=1)
		{
			if (Math.min(arr.get((int) startIndex), arr.get((int) startIndex + 1)) == arr.get(startIndex))
			{
				arr.remove(startIndex+1);
				findMin(arr, startIndex, endIndex-1);
			}
			else
			{
				arr.remove(startIndex);//since numerator>denominator
				findMin(arr, startIndex, endIndex-1);
			}
		}
		return arr.get(0);
	}
	public static int countNegativeOne(ArrayList<Integer> arr, int count)
	{	System.out.println("hi");
		if(arr.size() == count - 1) 
		{
			if(arr.get(count) == -1)
			{
				countNegativeOne(arr, count+1);
			}
			else
			{
				arr.remove(count);
				countNegativeOne(arr, count);
			}
		}
		return count;
	}
	}

	
	

