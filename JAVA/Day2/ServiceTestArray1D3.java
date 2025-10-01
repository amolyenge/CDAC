import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ServiceTestArray1D3 {
   
	// find all occurances of element in array
	 public static void printOccurances(int[] arr , int target ) {
		 for(int i = 0; i < arr.length;i++) {
			 if(arr[i] == target) {
				 System.out.println(i);
			 }
		 }
	 }
	 
	 // find all occurances and return list
	 public static List<Integer> printList(int[] arr , int target){
		 List<Integer> list = new ArrayList<>();
		 for(int i = 0 ; i < arr.length; i++) {
			 if(arr[i] == target) {
				 list.add(i);
			 }
		 }
		 return list;
	 }
	 
	 // nth max Element
	 public static int nthMax(int[] arr , int n) {
		 if(n <= 0 || n > arr.length) {
			 return -1;
		 }
		 Arrays.sort(arr);
		 int max = arr[arr.length - n];
		 
		 return max;
	 }
	 
	 // nth min Element
	 public static int nthMin(int[] arr , int n) {
		 if(n <= 0 || n > arr.length) {
			 return -1;
		 }
		 Arrays.sort(arr);
		 int min = arr[n - 1];
		 
		 return min;
	 }
}
