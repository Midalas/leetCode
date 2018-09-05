
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode228 {

	public static void main(String[] args) throws Exception {
		int[] nums = {};
		List<String> x = summaryRanges(nums);
		System.out.println("");
	}

	//runtime 3ms
	public static List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		if (nums.length < 1)
			return res;
		int from = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				if (from == i - 1) {
					res.add("" + nums[from]);
				} else {
					res.add(nums[from] + "->" + nums[i - 1]);
				}
				from = i;
			}
		}
		if (from == nums.length - 1) {
			res.add("" + nums[from]);
		} else {
			res.add(nums[from] + "->" + nums[nums.length - 1]);
		}
		return res;
	}

}
