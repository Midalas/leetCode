
package leetCode;

public class leetCode724 {

	public static void main(String[] args) throws Exception {

		int[] nums = { -1, -1, -1, -1, 1, 0 };
		int x = pivotIndex(nums);
		System.out.println();
	}

	// runtime 31ms
	public static int pivotIndex(int[] nums) {
		if (nums.length < 1)
			return -1;
		int total = 0;
		for (int i = 0; i < nums.length; i++)
			total += nums[i];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum + sum == total - nums[i])
				return i;
			sum += nums[i];
		}
		return -1;
	}


}
