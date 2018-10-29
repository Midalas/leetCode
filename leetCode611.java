package leetCode;

import java.util.Arrays;

public class leetCode611 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 2, 2, 3, 4 };
		int x = triangleNumber(nums);
		System.out.println();
	}

	// runtime 30ms
	public static int triangleNumber(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; i--) {
			int start = 0;
			int end = i - 1;
			while (start < end) {
				if (nums[start] + nums[end] > nums[i]) {
					res += end - start;
					end--;
				} else {
					start++;
				}
			}
		}
		return res;
	}
}
