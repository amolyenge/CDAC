package OCT_20_2025;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number to check Armstrong.");
	     int num = sc.nextInt();
	     int original = num;
	     int sum = 0;
	     
	     int digits = String.valueOf(num).length();
	     while(num != 0) {
	       int digit = num % 10;
	       sum += Math.pow(digit, digits);
	       num = num / 10;
	     }
	     
	     if(sum == original) {
	    	 System.out.println("Num is Armstrong number ..");
	     }else {
	    	 System.out.println("Number is Not Armstrong number..");
	     }

		}

}

// armstrong num ex    153 = (1e3 + 5e3 + 3e3) = (1 + 125 + 27 = 153)
