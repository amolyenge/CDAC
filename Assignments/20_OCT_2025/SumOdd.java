package OCT_20_2025;

import java.util.Scanner;

public class sumOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Odd Sum : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num;i++) {
			if(isOdd(i)) {
				sum += i;
			}
		}
		
		System.out.println("Sum of odd Numbers is : " + sum);

	}
	
	public static boolean isOdd(int n) {
		if(n % 2 == 0) {
			return false;
		}
		return true;
	}

}
