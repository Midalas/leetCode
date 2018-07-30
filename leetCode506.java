
package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetCode506 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 3, 5, 2, 4, 1 };

		String[] x = findRelativeRanks(nums);
		System.out.println();
	}

	//runtime 24ms
	public static Map<Integer, String> map506 = new HashMap<Integer, String>();
	static {
		map506.put(1, "Gold Medal");
		map506.put(2, "Silver Medal");
		map506.put(3, "Bronze Medal");
	}

	public static String[] findRelativeRanks(int[] nums) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			temp[i] = nums[i];
		Arrays.sort(nums);
		String[] res = new String[nums.length];
		for (int i = 0; i < temp.length; i++) {
			int tmp = findPlace(nums, temp[i]);
			res[i] = tmp < 4 ? map506.get(tmp) : "" + tmp;
		}
		return res;
	}

	private static int findPlace(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == k)
				return nums.length - i;
		return -1;
	}
}
