import java.util.ArrayList;
import java.util.Arrays;
public class calculateTime
{

	public static float findSelectionTime(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a*10000,100);
		StopWatch t = new StopWatch();
		t.start();
		SelectionSorter.sort(thisarray);
		t.stop();
		return t.getElapsedTime();
	}
	public static float findMergeTime(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a*10000,100);
		StopWatch t = new StopWatch();
		t.start();
		MergeSorter.sort(thisarray);
		t.stop();
		return t.getElapsedTime();
	}
	public static float findQuickTime(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a*10000,100);
		StopWatch t = new StopWatch();
		t.start();
		quickSort.qsort(thisarray,0,(a*10000)-1);
		t.stop();
		return t.getElapsedTime();
	}
	public static float findArraySort(int a)
	{
		int thisarray[] = ArrayUtil.randomIntArray(a*10000,100);
		StopWatch t = new StopWatch();
		t.start();
		Arrays.sort(thisarray);
		t.stop();
		return t.getElapsedTime();
	}

}