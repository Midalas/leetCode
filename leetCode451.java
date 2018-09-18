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
public class leetCode451 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	// runtime 53ms
	public static String frequencySort(String s) {
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		PriorityQueue<Object[]> queue = new PriorityQueue<>(new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				// TODO Auto-generated method stub
				Integer val1 = (int) o1[1];
				Integer val2 = (int) o2[1];
				return val2.compareTo(val1);
			}
		});
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		for (Character c : map.keySet())
			queue.add(new Object[] { c, map.get(c) });
		while (!queue.isEmpty()) {
			Object[] obj = queue.poll();
			char c = (char) obj[0];
			for (int i = 0; i < (int) obj[1]; i++)
				sb.append(c);
		}
		return sb.toString();
	}
}
