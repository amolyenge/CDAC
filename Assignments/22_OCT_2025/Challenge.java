package OCT_22_2025;

import java.util.Scanner;
import java.util.Arrays;

public class Challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (distinct, one missing in sequence):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int missing = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                missing = arr[i] + 1;
                break;
            }
        }

        if (missing == -1) {
            missing = arr[0] != 0 ? arr[0] - 1 : arr[n - 1] + 1;
        }

        System.out.println("\nMissing Number: " + missing);
        sc.close();
    }
}
