import java.util.ArrayList;
import java.util.Arrays;
public class Timer
{
	public static void main(String[] args)
	{
		int[] a1 = ArrayUtil.randomIntArray(10000,100);
		int[] a2 = ArrayUtil.randomIntArray(20000,100);
		int[] a3 = ArrayUtil.randomIntArray(30000,100);
		int[] a4 = ArrayUtil.randomIntArray(40000,100);
		int[] a5 = ArrayUtil.randomIntArray(50000,100);
		int[] a6 = ArrayUtil.randomIntArray(60000,100);
		ArrayList<Integer> selection = new ArrayList<Integer>();
		ArrayList<Long> merge = new ArrayList<Long>();
		ArrayList<Long> quick = new ArrayList<Long>();
		ArrayList<Long> arraysort = new ArrayList<Long>();
		StopWatch t = new StopWatch();

		//for selection sort
		System.out.println("Selection Sorter:\n");
		t.start();
		SelectionSorter.sort(a1);
		t.stop();
		System.out.println("Length: "+ a1.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		SelectionSorter.sort(a2);
		t.stop();
		System.out.println("Length: "+ a2.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		SelectionSorter.sort(a3);
		t.stop();
		System.out.println("Length: "+ a3.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		SelectionSorter.sort(a4);
		t.stop();
		System.out.println("Length: "+ a4.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		SelectionSorter.sort(a5);
		t.stop();
		System.out.println("Length: "+ a5.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		SelectionSorter.sort(a6);
		t.stop();
		System.out.println("Length: "+ a6.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		System.out.println("Merge Sort");

		t.start();
		MergeSorter.sort(a1);
		t.stop();
		System.out.println("Length: "+ a1.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		MergeSorter.sort(a2);
		t.stop();
		System.out.println("Length: "+ a2.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();	

		t.start();
		MergeSorter.sort(a3);
		t.stop();
		System.out.println("Length: "+ a3.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		MergeSorter.sort(a4);
		t.stop();
		System.out.println("Length: "+ a4.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		MergeSorter.sort(a5);
		t.stop();
		System.out.println("Length: "+ a5.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		MergeSorter.sort(a6);
		t.stop();
		System.out.println("Length: "+ a6.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		

		System.out.println("Array.Sort: \n");
		t.start();
		Arrays.sort(a1);
		t.stop();
		System.out.println("Length: "+ a1.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		Arrays.sort(a2);
		t.stop();
		System.out.println("Length: "+ a2.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();	

		t.start();
		Arrays.sort(a3);
		t.stop();
		System.out.println("Length: "+ a3.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		Arrays.sort(a4);
		t.stop();
		System.out.println("Length: "+ a4.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		Arrays.sort(a5);
		t.stop();
		System.out.println("Length: "+ a5.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		Arrays.sort(a6);
		t.stop();
		System.out.println("Length: "+ a6.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();


		System.out.println("Quick Sort");
		System.out.println(a1.length + " " +a2.length + " " +a3.length + " " +a4.length + " " +a5.length + " " +a6.length + " ");

		/*t.start();
		quickSort.qsort(a1,0,9999);
		t.stop();
		System.out.println("Length: "+ a1.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		*/t.start();
		quickSort.qsort(a2,0,20000);
		t.stop();
		System.out.println("Length: "+ a2.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();	/*

		t.start();
		quickSort.qsort(a3,0,29999);
		t.stop();
		System.out.println("Length: "+ a3.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		quickSort.qsort(a4,0,39999);
		t.stop();
		System.out.println("Length: "+ a4.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		quickSort.qsort(a5,0,49999);
		t.stop();
		System.out.println("Length: "+ a5.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();

		t.start();
		quickSort.qsort(a6,0,59999);
		t.stop();
		System.out.println("Length: "+ a6.length + "| T = " + t.getElapsedTime()+ "ms");
		t.reset();*/


	}
}