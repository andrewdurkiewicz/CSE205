import java.util.ArrayList;
import java.util.Arrays;
public class calculateTime
{

	public static long findSelectionTime(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a,100);
		StopWatch t = new StopWatch();
		t.start();
		SelectionSorter.sort(thisarray);
		t.stop();
		return t.getElapsedTime();
	}
	public static long findMergeTime(int[] a)
	{
		StopWatch m = new StopWatch();
		m.start();
		MergeSorter.sort(a);
		m.stop();
		return m.getElapsedTime();
	}
	public static long findQuickTime(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a,100);
		StopWatch q = new StopWatch();
		q.start();
		quickSort.qsort(thisarray,0,(a*10000)-1);
		q.stop();
		return q.getElapsedTime();
	}
	public static long findArraySort(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a,100);
		StopWatch as = new StopWatch();
		as.start();
		Arrays.sort(thisarray);
		as.stop();
		return as.getElapsedTime();
	}

}