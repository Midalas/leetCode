
package leetCode;

public class leetCode674 {

	public static void main(String[] args) throws Exception {

		int[] nums = { 1, 3, 5, 7 };
		int x = findLengthOfLCIS(nums);
		System.out.println();
	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length < 1)
			return 0;
		int res = 0;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				max++;
			} else {
				res = max > res ? max : res;
				max = 1;
			}
		}
		res = max > res ? max : res;
		max = 1;
		return res;
	}
}
