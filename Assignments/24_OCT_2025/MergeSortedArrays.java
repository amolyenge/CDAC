import java.util.*;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays and place the smaller one in result
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1 (if any)
        while (i < n) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2 (if any)
        while (j < m) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6};

        int[] merged = mergeArrays(nums1, nums2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
