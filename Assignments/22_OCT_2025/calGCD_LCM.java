package OCT_22_2025;

import java.util.Scanner;

public class calGCD_LCM {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter first number (a): ");
	     int a = sc.nextInt();
	     System.out.print("Enter second number (b): ");
	     int b = sc.nextInt();
	     
	     a = Math.abs(a);
	     b = Math.abs(b);
	     
	     int gcd = findGCD(a,b);
	     int lcm = findLCM(a,b);
	     
	     System.out.println("GCD is : " + gcd);
	     System.out.println("LCM is : " + lcm);

	}
	
	public static int findGCD(int a , int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	
	public static int findLCM(int a , int b) {
		return ( a * b ) / findGCD(a,b);
	}

}
