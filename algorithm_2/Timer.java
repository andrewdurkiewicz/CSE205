import java.util.ArrayList;
public class Timer
{
	public static void main(String[] args)
	{;
		int[] length = {1,2,3,4,5,6};
		ArrayList<Float> selection_sort = new ArrayList<Float>();
		ArrayList<Float> merge_sort = new ArrayList<Float>();
		ArrayList<Float> quick_sort = new ArrayList<Float>();
		ArrayList<Float> arraysSort = new ArrayList<Float>();

		for (int i = 0; i<=5; i++)
		{
			selection_sort.add(calculateTime.findSelectionTime(length[i]));
			merge_sort.add(calculateTime.findMergeTime(length[i]));
			quick_sort.add(calculateTime.findQuickTime(length[i]));
			arraysSort.add(calculateTime.findArraySort(length[i]));

		}



		/*t.start();
		SelectionSorter.sort(a1);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();

		t.start();
		SelectionSorter.sort(a2);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();

		t.start();
		SelectionSorter.sort(a3);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();

		t.start();
		SelectionSorter.sort(a4);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();

		t.start();
		SelectionSorter.sort(a5);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();

		t.start();
		SelectionSorter.sort(a6);
		t.stop();
		selection_sort.add(t.getElapsedTime());
		t.reset();
		System.out.println(selection_sort);*/








	}
}