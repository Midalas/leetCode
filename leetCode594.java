package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leetCode594 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	//runtime 53ms
	public int findLHS(int[] nums) {
		int max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int t = nums[i];
			if (map.containsKey(t)) {
				map.put(t, map.get(t) + 1);
			} else {
				map.put(t, 1);
			}
		}

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int i = it.next();
			if (null != map.get(i + 1)) {
				max = map.get(i) + map.get(i + 1) > max ? map.get(i) + map.get(i + 1) : max;
			}
		}
		return max;
	}

}
