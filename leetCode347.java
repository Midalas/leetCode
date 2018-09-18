package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class leetCode347 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		List<Integer> x = topKFrequent(nums, k);
		System.out.println();
	}

	// runtime 20ms
	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		PriorityQueue<Integer[]> queue = new PriorityQueue<>(new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				return o2[1].compareTo(o1[1]);
			}
		});
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Integer keys : map.keySet())
			queue.add(new Integer[] { keys, map.get(keys) });
		while (k-- > 0 && !queue.isEmpty())
			res.add(queue.poll()[0]);

		return res;
	}
}
