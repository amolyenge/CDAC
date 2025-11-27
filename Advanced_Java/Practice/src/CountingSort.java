import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {2,2,3,1,5,5,6,9,9,8,6,0,22,12,10};
		countSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void countSort(int[] arr) {
		
		// get max and min  
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1; // set range
		
		//Auxilary array to store count
		int[] count = new int[range];
		
		// Auxilary array to store resultant sorted array
		int[] output = new int[arr.length];
		
		//store count of each element
		for(int j : arr) {
			count[j - min]++;
		}
		
		//change count[i] so that count[i] now contains 
		//actual position of character in output array
		for(int i = 1; i < count.length ; i++) {
			count[i] += count[i - 1];
		}
		
		
		//Build output array to make it stable , we are operating in reverse order
		for(int i = arr.length - 1; i >= 0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}
		
		// copy sorted array to original array
		for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
	}

}
