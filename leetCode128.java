
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode128 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		int x = longestConsecutive(nums);
		System.out.println("");
	}

	//735ms
	public static int longestConsecutive(int[] nums) {
		// 100, 4, 200, 1, 3, 2
		int res = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int length = 1 + getLeftLength(map, temp - 1) + getRightLength(map, temp + 1);
			map.put(temp, 0);
			res = length > res ? length : res;
		}

		return res;
	}

	private static int getLeftLength(Map<Integer, Integer> map, int i) {
		if (null == map.get(i) || 0 == map.get(i)) {
			return 0;
		}
//		map.put(i, 0);
		return getLeftLength(map, i - 1) + 1;
	}

	private static int getRightLength(Map<Integer, Integer> map, int i) {
		if (null == map.get(i) || 0 == map.get(i)) {
			return 0;
		}
//		map.put(i, 0);
		return getRightLength(map, i + 1) + 1;
	}
}
