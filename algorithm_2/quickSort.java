public class quickSort
{

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