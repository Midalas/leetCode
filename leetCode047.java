
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetCode047 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < nums.length; i++) 
			list2.add(nums[i]);
		dfs(result, set, list1, list2);
		return result;
	}

	private static void dfs(List<List<Integer>> result, Set<String> set, List<Integer> list1, List<Integer> list2) {
		if (list2.isEmpty()) {
			if (!set.contains(list1.toString())) {
				set.add(list1.toString());
				result.add(new ArrayList<Integer>(list1));
			}
			return;
		} else {
			for (int i = 0; i < list2.size(); i++) {
				List<Integer> temp1 = new ArrayList<Integer>(list1);
				List<Integer> temp2 = new ArrayList<Integer>(list2);
				temp1.add(temp2.get(i));
				temp2.remove(i);
				dfs(result, set, temp1, temp2);
			}
		}
	}
	
}
