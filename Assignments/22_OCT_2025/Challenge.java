import java.util.Arrays;

public class Challenge {

	public static void main(String[] args) {
      int[] nums = {0,1,3,5,6,7,8,4};
     // Arrays.sort(nums);
      int ans = findMissing(nums);
      System.out.println(ans);
	}
	
	public static int findMissing(int[] nums) {
		int n = nums.length;
		
		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;
		
		for(int num : nums) {
			arraySum += num;
		}
		return totalSum - arraySum;
	}

}
