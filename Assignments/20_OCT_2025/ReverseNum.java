package OCT_20_2025;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to reverse..");
		int num = sc.nextInt();
		int reversed = 0;
		
		while(num != 0) {
			int digit = num % 10;
		    reversed = reversed * 10 + digit;
		    num = num / 10;
		}
		System.out.println(reversed);

	}

}


// This will keep zeros and print
//public class ReverseNumwithZeros {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to reverse (can include zeros): ");
//        String numStr = sc.next();  // read as string
//
//        // reverse using StringBuilder
//        String reversed = new StringBuilder(numStr).reverse().toString();
//
//        System.out.println("Reversed (with zeros preserved): " + reversed);
//
//        sc.close();
//    }
//}
