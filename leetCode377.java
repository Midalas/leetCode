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
public class leetCode377 {
	public static void main(String[] args) throws Exception {

		int[] nums = { 1,2,3};
		int target = 4;
		int x = combinationSum4(nums, target);
		System.out.println();
	}

	// runtime 5ms
	public static int combinationSum4(int[] nums, int target) {
		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 1; i <= target; i++)
			for (Integer j : nums)
				if (j <= i)
					dp[i] += dp[i - j];
		return dp[target];
	}
}
