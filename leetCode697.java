
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode697 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
		int x = findShortestSubArray(nums);
		System.out.println();
	}

	//runtime 45ms
	public static int findShortestSubArray(int[] nums) {
		int[] count = new int[50000];
		int start = -1;
		int end = nums.length;
		int max = 0;
		List<Integer> maxList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++)
			count[nums[i]] += 1;
		for (int i = 0; i < count.length; i++)
			if (count[i] == max) {
				maxList.add(i);
			} else if (count[i] > max) {
				maxList.clear();
				maxList.add(i);
				max = count[i];
			}
		int res = Integer.MAX_VALUE;
		for (Integer num : maxList) {
			for (int i = 0; i < nums.length; i++)
				if (nums[i] == num) {
					start = i;
					break;
				}
			for (int i = nums.length - 1; i >= 0; i--)
				if (nums[i] == num) {
					end = i;
					break;
				}

			res = end - start + 1 < res ? end - start + 1 : res;
		}

		return res;
	}
}
