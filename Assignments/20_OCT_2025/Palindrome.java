package OCT_20_2025;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to check Palindrome.");
     int num = sc.nextInt();
     int original = num;
     int reverse = 0;
     
     while(num != 0) {
       int digit = num % 10;
       reverse = reverse * 10 + digit;
       num = num / 10;
     }
     
     if(reverse == original) {
    	 System.out.println("Num is Palindrome..");
     }else {
    	 System.out.println("Number is Not Palindrome..");
     }

	}

}
