
package leetCode;

import java.util.Arrays;

public class leetCode532 {

	public static void main(String[] args) throws Exception {
		int[] nums = {};
		int k = 0;
		int x = findPairs(nums, k);
		System.out.println();
	}

	public static int findPairs(int[] nums, int k) {
		int count = 0;
		int temp = Integer.MIN_VALUE;
		Arrays.sort(nums);
		if (k < 0)
			return 0;
		if (k == 0)
			return foundDuplicates(nums);
		int[] nums1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			nums1[i] = nums[i] + k;
		for (int m = 0, n = 0; m < nums.length && n < nums1.length;) {
			if (nums[m] == nums1[n]) {
				if (nums[m] != temp) {
					temp = nums[m];
					count++;
				}
				m++;
				n++;
			} else if (nums[m] < nums1[n]) {
				m++;
			} else {
				n++;
			}
		}
		return count;
	}

	private static int foundDuplicates(int[] nums) {
		int temp = Integer.MIN_VALUE;
		int count = 0;
		if (nums.length < 2)
			return 0;
		for (int i = 0, j = 1; i < nums.length && j < nums.length;) {
			if (i == j) {
				j++;
			} else if (nums[i] < nums[j]) {
				i++;
			} else if (nums[i] > nums[j]) {
				j++;
			} else if (nums[i] == nums[j]) {
				if (nums[i] != temp) {
					temp = nums[i];
					count++;
				}
				i++;
				j++;
			}
		}
		return count;
	}
}
