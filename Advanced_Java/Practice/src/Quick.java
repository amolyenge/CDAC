import java.util.Arrays;

public class Quick {
   public static void main(String[] args) {
	   int[] arr = {12,34,5,43,2,3,45,6,7,87,98,89,0,9,77,65};
	   int begin = 0;
	   int end = arr.length - 1;
	   quickSort(arr,begin,end);
	   System.out.println(Arrays.toString(arr));
   }
   
   public static void quickSort(int[] arr , int begin , int end) {
	   if(begin < end) {
		   // find partition
		   int partition = findPartition(arr,begin,end);
		   
		   // do quickSort on left
		   quickSort(arr , begin , partition - 1);
		   
		   // do QuickSort on right
		   quickSort(arr , partition + 1, end);
	   }
   }
   
   private static int findPartition(int[] arr , int begin , int end) {
	   // Taking last element as pivot
	   int pivot = arr[end];
	   
	   int i = (begin - 1); // index of smaller element
	   
	   for(int j = begin; j < end;j++) {
		   //if current element is smaller than pivot
		   if(arr[j] < pivot) {
			   i++;
			   swap(arr , i , j);
		   }
	   }
	   
	   //swap arr[i + 1] and arr[high] or pivot
	   swap(arr,i + 1,end);
	   return i + 1;
   }
   
   private static void swap(int[] arr , int begin , int end) {
	   int temp = arr[begin];
	   arr[begin] = arr[end];
	   arr[end] = temp;
   }
}
