package OCT_22_2025;

import java.util.Scanner;

public class Patterns {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Number Pattern Menu =====");
            System.out.println("1. Number Triangle");
            System.out.println("2. Inverted Number Triangle");
            System.out.println("3. Number Pyramid");
            System.out.println("4. Right-Aligned Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter number of rows: ");
                int r = sc.nextInt();

                switch (choice) {
                    case 1:
                        numberTriangle(r);
                        break;
                    case 2:
                        invertedNumberTriangle(r);
                        break;
                    case 3:
                        numberPyramid(r);
                        break;
                    case 4:
                        rightAlignedTriangle(r);
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        System.out.println("Thank you for using the program!");
        sc.close();
    }
	
	
	
    // Function 1: Simple Number Triangle
    public static void numberTriangle(int r) {
        System.out.println("\nNumber Triangle:");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Function 2: Inverted Number Triangle
    public static void invertedNumberTriangle(int r) {
        System.out.println("\nInverted Number Triangle:");
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Function 3: Number Pyramid
    public static void numberPyramid(int r) {
        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= r; i++) {
            // Print spaces
            for (int space = i; space < r; space++) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    // Function 4: Right-Aligned Triangle
    public static void rightAlignedTriangle(int r) {
        System.out.println("\nRight-Aligned Triangle:");
        for (int i = 1; i <= r; i++) {
            for (int space = i; space < r; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
