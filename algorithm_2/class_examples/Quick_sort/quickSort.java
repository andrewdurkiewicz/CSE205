public class quickSort
{
	public static void main(String[] args)
	{
		int[] a={102, 45, 8, 200, -1, 0};
		qsort(a, 0, 5);
		for(int i=0; i < a.length ; i++)
		System.out.print(a[i] + " ");


	}

   public static void qsort(int[] a, int start, int end)
   {
     if(start < end)
     {
         int pIndex=partition(a, start, end);
         qsort(a,start, pIndex-1);
         qsort(a,pIndex+1, end);

    }
  }

  public static int partition(int[] b, int start, int end)
  {
    int pivot=b[end];
    int pindex=start;

    for(int i=start; i<end ; i++)
    {
      if(b[i] <= pivot)
      {
       int temp=b[i];
       b[i]=b[pindex];
       b[pindex]=temp;
       pindex++;
      }

    }
     int temp=b[pindex];
     b[pindex]=b[end];
     b[end]=temp;

     return pindex;
    }


}