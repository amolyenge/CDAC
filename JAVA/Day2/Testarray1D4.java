import java.util.Arrays;

public class Testarray1D4 {

	public static void main(String[] args) {
        int[] arr = {3,4,5,7,13,17};
        //all prime
        System.out.println(Servicearray1D4.displayPrime(arr));
        
        // Addition
        int sum = Servicearray1D4.addition(arr);
        System.out.println(sum);
        
        // factorials of elements less than 7
        System.out.println(Servicearray1D4.factorialALL(arr));
        
        int min = Servicearray1D4.nthMaxPrime(arr, 2);
        System.out.println(min);
        
        int max = Servicearray1D4.nthMinPrime(arr, 2);
        System.out.println(max);
	}
}
