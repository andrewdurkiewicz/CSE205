//Andrew Durkiewicz

import java.util.*; 
import java.util.Arrays;

public class Assignment8 
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[100]; //we were told that there will be a max of 100 integers, I will remove
									  //any empty entries later.
			
		ArrayList<Integer> arrForPrint = new ArrayList<Integer>();//since ArrayList print much nicer, I thought
																  //I could add this. Just for the look when executing.
		Scanner scan = new Scanner(System.in);//scan for the entry
		int condition = 1; //anything but 0, since that breaks the loop
		System.out.println("Enter the integer values: (0 to finish)");
		
		//code below is compiling the array to analyze. 
		int i = 0;
		while(condition!=0) //please note that this loop isn't doing any calculations. Only transfering inputs into the array.
		{
			System.out.println("Index[" + i +"]: ");
			condition = scan.nextInt();
			if (condition == 0)
			{
				break;
			}
			arrForPrint.add(condition);
			numbers[i] = condition;
			i++;
		}
		//Values is the same array but without the empty elements
		int[] values = Arrays.copyOfRange(numbers, 0, i);
		
		
		//display our solutions:
		System.out.println("The Array to be analyzed is:  " + arrForPrint);
		System.out.println("====================================================");
		System.out.println("The sum of the numbers at even indices is:******|" + computeSumAtEvenIndexes(values, 0));
		System.out.println("The number of odd integers within this list is:*|" + countOdd(values,0,values.length));
		System.out.println("The minimum value in the list is:***************|" + findMin(values, 0, values.length));
		System.out.println("The number of -1 instances is:******************|" + countNegativeOne(numbers, 0));

		scan.close();



	}
	public static int computeSumAtEvenIndexes(int[] arr, int index)
	{
		/*This function below, returns the ceiling function of the array size divided by 2.
		I do this because, it rounds the value up. This allows me to find the amount of even 
		indices, regardless of the initial length.*/
		int even_index_count = (int) Math.ceil((double) arr.length/2.0);
		if(index >= 2*even_index_count)
		{
			//we have gone past our last even index. Basically, this stops 
			//the recursion from being infinite. Which would cause an outOfRange error. 
			//so we return 0:
			return 0;
		}
		else
		{
			return (int) arr[index] + (int) computeSumAtEvenIndexes(arr,index+2);
		}
		
	}
	public static int countOdd(int[] arr,int startIndex,int endIndex)
	{
		if(startIndex == endIndex-1)
		{
			return Math.abs(arr[endIndex-1])%2;
		}
		else if(Math.abs(arr[startIndex])%2 == 0)
		{
			return 0 + countOdd(arr, startIndex + 1, endIndex);
		}
		else if(Math.abs(arr[startIndex])%2 != 0)
		{
			return 1 + countOdd(arr, startIndex + 1, endIndex);
		}
		else
		{
			//this shouldn't ever fire, but my compiler was mad about the fact that I didn't return an int
			//even though all of these returns will be of an int type. 
			return 0;
		}
	}
	public static int findMin(int[] arr, int startIndex, int endIndex)
	{
		if(startIndex == endIndex-1)
		{
			return arr[endIndex -1];
		}
		else
		{
			return Math.min(arr[startIndex], findMin(arr,startIndex + 1, endIndex));

		}
	}
	public static int countNegativeOne(int[] arr, int count)
	{	
		if(arr.length == count)
		{
			return 0;
		}
		if(arr[count]==-1)
		{
			return 1 + countNegativeOne(arr,count + 1);
		}
		else
		{
			return 0 + countNegativeOne(arr,count+1);
		}
	}

	}

	