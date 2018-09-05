
package leetCode;

public class leetCode213 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 3, 1 };
		int x = rob(nums);
		System.out.println("");
	}

	// runtime 6ms
	public static int rob(int[] nums) {
		if (nums.length < 1) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}

		return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
	}

	public static int rob(int[] nums, int start, int end) {
		int[] dp = new int[nums.length - 1];
		int len = end - start;
		dp[0] = nums[start];
		dp[1] = Math.max(nums[start], nums[start + 1]);
		for (int i = 2; i < len; i++)
			dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
		return dp[end - start - 1];
	}
}
