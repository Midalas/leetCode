
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode448 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> x = findDisappearedNumbers(nums);
		System.out.println();
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		boolean[] temp = new boolean[nums.length + 1];
		for (int i = 0; i < nums.length; i++)
			temp[nums[i]] = true;
		for (int i = 1; i < temp.length; i++)
			if (!temp[i])
				res.add(i);
		return res;
	}

}
