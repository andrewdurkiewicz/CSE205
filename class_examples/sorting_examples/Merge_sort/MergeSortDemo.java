import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{
   public static void main(String[] args)
   {
      int[] a = ArrayUtil.randomIntArray(300000, 100);
     // System.out.println(Arrays.toString(a));

      StopWatch timer = new StopWatch();

	   timer.start();




      MergeSorter.sort(a);

     timer.stop();

	 	        System.out.println("Elapsed time: "
	              + timer.getElapsedTime() + " milliseconds");

      //System.out.println(Arrays.toString(a));
   }
}

