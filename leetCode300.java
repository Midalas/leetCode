
package leetCode;

public class leetCode300 {

	public static void main(String[] args) throws Exception {
		// [[1,3,6,7,9,4,10,5,6]]
		int[] nums = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		int x = lengthOfLIS(nums);
		System.out.println("");
	}

	//runtime 24ms
	public static int lengthOfLIS(int[] nums) {
		int len = nums.length;
		if (len < 1)
			return 0;
		int[] dp = new int[len];
		dp[0] = 1;
		int res = dp[0];
		for (int i = 1; i < len; i++) {
			int temp = 0;
			for (int j = i - 1; j >= 0; j--)
				if (nums[i] > nums[j])
					temp = dp[j] > temp ? dp[j] : temp;
			dp[i] = temp + 1;
			res = dp[i] > res ? dp[i] : res;
		}
		return res;
	}
}
