package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class test2 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int t = nums[i];
			if (map.containsKey(t)) {
				map.put(t, map.get(t));
			} else {
				map.put(t, 1);
			}
		}
		
		
		
		return res;
	}
}
