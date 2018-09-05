
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode229 {

	public static void main(String[] args) throws Exception {

		int[] nums = { 1, 2, 2, 3, 3, 4, 4, 5, 1, 1, 1, 1 };
		List<Integer> x = majorityElement(nums);
		System.out.println("");
	}

	// runtime 30ms
	public static List<Integer> majorityElement(int[] nums) {
		int n = nums.length / 3;
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		for (Integer i : map.keySet())
			if (map.get(i) > n)
				res.add(i);

		return res;
	}

	//fast solution 2ms
	public List<Integer> majorityElement1(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		if (nums == null || nums.length == 0) {
			return list;
		}
		int count1 = 0;
		int count2 = 0;
		int number1 = 0;
		int number2 = 1;
		for (int i : nums) {
			if (i == number1) {
				count1++;
			} else if (i == number2) {
				count2++;
			} else if (count1 == 0) {
				number1 = i;
				count1++;
			} else if (count2 == 0) {
				number2 = i;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;
		for (int j : nums) {
			if (j == number1) {
				count1++;
			} else if (j == number2) {
				count2++;
			}
		}

		if (count1 > (nums.length / 3)) {
			list.add(number1);
		}
		if (count2 > (nums.length / 3)) {
			list.add(number2);
		}

		return list;
	}

}
