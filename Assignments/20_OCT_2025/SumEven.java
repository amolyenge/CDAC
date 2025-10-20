package OCT_20_2025;

import java.util.Scanner;

public class SumEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Even Sum : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num;i++) {
			if(isEven(i)) {
				sum += i;
			}
		}
		
		System.out.println("Sum of even Numbers is : " + sum);

	}
	
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}

}
