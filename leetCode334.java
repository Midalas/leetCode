package leetCode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class leetCode334 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 5, 4, 3, 2, 1 };
		boolean x = increasingTriplet(nums);
		System.out.println();
	}

	// runtime 6ms
	public static boolean increasingTriplet(int[] nums) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= min1) {
				min1 = nums[i];
			} else if (nums[i] <= min2) {
				min2 = nums[i];
			} else {
				return true;
			}
		}
		return false;
	}

}
