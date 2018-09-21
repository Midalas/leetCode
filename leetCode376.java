package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.jna.platform.win32.Winspool.PRINTER_INFO_4;

import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class leetCode376 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		int x = wiggleMaxLength(nums);
		System.out.println();
	}

	//runtime 0ms
	public static int wiggleMaxLength(int[] nums) {
		if (nums.length < 1)
			return 0;
		int[] dp1 = new int[nums.length];
		int[] dp2 = new int[nums.length];
		dp1[0] = 1;
		dp2[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				dp1[i] = dp2[i - 1] + 1;
				dp2[i] = dp2[i - 1];
			} else if (nums[i] < nums[i - 1]) {
				dp2[i] = dp1[i - 1] + 1;
				dp1[i] = dp1[i - 1];
			} else {
				dp1[i] = dp1[i - 1];
				dp2[i] = dp2[i - 1];
			}
		}
		return Math.max(dp1[nums.length - 1], dp2[nums.length - 1]);
	}
}
