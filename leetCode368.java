package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class leetCode368 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> x = largestDivisibleSubset(nums);
		System.out.println();
	}

	//runtime 52ms
	public static List<Integer> largestDivisibleSubset(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		if (nums.length < 1)
			return res;
		Arrays.sort(nums);
		//dp求解nums对应的最大子集大小
		int[] dp = new int[nums.length];
		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--)
				if (nums[i] % nums[j] == 0)
					if (dp[j] > max)
						max = dp[j];
			dp[i] = max + 1;
		}
		//获取最大子集大小的值和index
		int maxp = 0;
		int index = 0;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] > maxp) {
				maxp = dp[i];
				index = i;
			}
		}
		//从大到小加入结果集
		res.add(nums[index]);
		for (int i = index - 1; i >= 0; i--) {
			if (dp[index] == dp[i] + 1 && nums[index] % nums[i] == 0) {
				maxp = dp[i];
				index = i;
				res.add(0, nums[index]);
			}
		}
		return res;
	}
}
