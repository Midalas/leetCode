
package leetCode;

import java.util.Arrays;

public class leetCode268 {

	public static void main(String[] args) throws Exception {

		int[] nums = { 1 };
		int x = missingNumber(nums);
		System.out.println();
	}
	// runtime 1ms
	public static int missingNumber(int[] nums) {
		int len = nums.length;
		int[] temp = new int[len + 1];
		for (int i = 0; i <= len; i++)
			temp[i] = -1;
		for (int i = 0; i < len; i++)
			temp[nums[i]] = nums[i];
		for (int i = 0; i < len + 1; i++)
			if (temp[i] != i)
				return i;
		return -1;
	}

	// runtime 11ms
	public static int missingNumber1(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != i)
				return i;
		return nums.length;
	}

}
