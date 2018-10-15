package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode756 {
	public static void main(String[] args) {

		// bottom 的长度范围在 [2, 8]。
		// allowed 的长度范围在[0, 200]。
		// 方块的标记字母范围为{'A', 'B', 'C', 'D', 'E', 'F', 'G'}。
		// bottom = "XXYX", allowed = ["XXX", "XXY", "XYX", "XYY", "YXZ"]
		String bottom = "XYZ";
		List<String> allowed = Arrays.asList(new String[] { "XYD", "YZE", "DEA", "FFF" });
		boolean x = pyramidTransition(bottom, allowed);
		System.out.println();
	}


	//runtime 50ms
	public static boolean pyramidTransition(String bottom, List<String> allowed) {
		Map<String, LinkedList<Character>> allows = new HashMap<String, LinkedList<Character>>();
		for (String str : allowed) {
			String key = str.substring(0, 2);
			if (allows.containsKey(key)) {
				allows.get(key).add(str.charAt(2));
			} else {
				LinkedList<Character> t = new LinkedList<Character>();
				t.add(str.charAt(2));
				allows.put(key, t);
			}
		}
		List<LinkedList<Character>> list = new ArrayList<LinkedList<Character>>();
		for (int i = 0; i < bottom.length() - 1; i++) {
			if (allows.containsKey(bottom.substring(i, i + 2))) {
				list.add(allows.get(bottom.substring(i, i + 2)));
			} else {
				return false;
			}
		}
		return bfs(list, allows);
	}

	private static boolean bfs(List<LinkedList<Character>> list, Map<String, LinkedList<Character>> allows) {
		int index = 0;
		List<LinkedList<Character>> temp = new ArrayList<LinkedList<Character>>();
		if (list.size() < 2)
			return true;
		while (index + 1 < list.size()) {
			Set<Character> set = new HashSet<Character>();
			LinkedList<Character> l = new LinkedList<Character>();
			for (Character c : list.get(index)) {
				for (Character t : list.get(index + 1)) {
					String ct = c + "" + t;
					if (allows.containsKey(ct)) {
						for (Character r : allows.get(ct)) {
							if (!set.contains(r)) {
								l.add(r);
								set.add(r);
							}
						}
					}
				}
			}
			if (l.isEmpty())
				return false;
			index++;
			temp.add(l);
		}
		return bfs(temp, allows);
	}

}
