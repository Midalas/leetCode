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
public class leetCode692 {
	public static void main(String[] args) throws Exception {
		String[] words = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
		int k = 4;
		List<String> x = topKFrequent(words, k);
		System.out.println();
	}

	// runtime 28ms
	public static List<String> topKFrequent(String[] words, int k) {
		List<String> res = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		PriorityQueue<Object[]> queue = new PriorityQueue<>(new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				// TODO Auto-generated method stub
				Integer val1 = (int) o1[1];
				Integer val2 = (int) o2[1];
				if (val1 == val2) {
					String str1 = o1[0].toString();
					String str2 = o2[0].toString();
					return str1.compareTo(str2);
				} else {
					return val2.compareTo(val1);
				}
			}
		});
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);
			} else {
				map.put(words[i], 1);
			}
		}
		for (String key : map.keySet())
			queue.add(new Object[] { key, map.get(key) });

		while (k-- > 0 && !queue.isEmpty()) {
			Object[] obj = queue.poll();
			res.add(obj[0].toString());
		}
		return res;
	}
}
