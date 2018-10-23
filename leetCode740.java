package leetCode;

public class leetCode740 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 2};
		int x = deleteAndEarn(nums);
		System.out.println();
	}

	//runtime 5ms
	public static int deleteAndEarn(int[] nums) {
		if(nums.length<1)
			return 0;
		int max = 0;
		int[] arr = new int[10000];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]] += nums[i];
			max = nums[i] > max ? nums[i] : max;
		}

		int[] dp = new int[max+1];
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0], arr[1]);
		for (int i = 2; i <= max; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
		}
		return dp[max];
	}
}
