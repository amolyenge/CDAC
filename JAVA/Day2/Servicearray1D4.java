import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Servicearray1D4 {
   
	// display all prime numbers from array
	public static List<Integer> displayPrime(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			boolean ans = isPrimeH(arr[i]);
			if(ans) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	
	// helper for displayPrime
	private static boolean isPrimeH(int n) {
	     for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) return false;
	     }
	   return true;
	}
	
	
	
	// Addition of all Elements
	public static int addition(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	
	// factorial Helper 
	private static int factorial(int n) {
		int fact = 1;
		for(int i = 1 ; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	// print all factorials
	public static List<Integer> factorialALL(int[] arr) {
		List<Integer> list = new ArrayList<>();
          for(int i = 0 ; i < arr.length; i++) {
        	  if(arr[i] < 7) {
        		  int ans = factorial(arr[i]);
        		  list.add(ans);
        	  }
          }
          return list;
	}
	
	
	
	
	
	
	 // nth max Element
	 public static int nthMaxPrime(int[] arr , int n) {
		 int[] primes = new int[arr.length];
	        int count = 0;

	        // Collect prime numbers
	        for (int num : arr) {
	            if (isPrimeH(num)) {
	                primes[count++] = num;
	            }
	        }
		 Arrays.sort(primes);
		 int max = primes[primes.length - n];
		 
		 return max;
	 }
	 
	 // nth min Element
	 public static int nthMinPrime(int[] arr , int n) {
		 int[] primes = new int[arr.length];
	        int count = 0;

	        // Collect prime numbers
	        for (int num : arr) {
	            if (isPrimeH(num)) {
	                primes[count++] = num;
	            }
	        }
		 Arrays.sort(primes);
		 int min = primes[n - 1];
		 
		 return min;
	 }
	
	
}
