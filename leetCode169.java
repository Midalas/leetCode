
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode169 {

	public static void main(String[] args) throws Exception {

		int[] nums = { 3, 3, 4 };

		int x = majorityElement(nums);

		System.out.println();
	}

	// runtime 7ms
	public static int majorityElement(int[] nums) {
		int temp = nums[0];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				temp = nums[i];
				count = 1;
			} else {
				if (nums[i] == temp) {
					count++;
				} else {
					count--;
				}
			}
		}
		return temp;
	}

	// runtime 33ms
	public static int majorityElement1(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len = nums.length;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if (map.containsKey(temp)) {
				if (map.get(temp) + 1 <= len / 2) {
					map.replace(temp, map.get(temp) + 1);
				} else
					return temp;
			} else {
				map.put(temp, 1);
			}
		}
		return nums[0];
	}
}
