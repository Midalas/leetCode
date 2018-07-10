
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class leetCode030 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> resultlist = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		if (words.length < 1 || words.length < 1) 
			return resultlist;
		int length = words[0].length();
		if (s.length() < length) 
			return resultlist;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			int k = 0;
			if (!set.contains(words[i])) {
				set.add(words[i]);
				while (k != -1) {
					k = s.indexOf(words[i], k);
					if (k != -1) {
						list.add(k);
						k++;
					}
				}
			}
		}
		int m = 0;
		while (m < list.size()) {
			if (list.get(m) + length * words.length > s.length()) {
				m++;
				continue;
			}
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j < words.length; j++) {
				if (map.containsKey(words[j])) {
					map.put(words[j], map.get(words[j]) + 1);
				} else {
					map.put(words[j], 1);
				}
			}

			String str = s.substring(list.get(m), list.get(m) + length * words.length);
			while (str.length() >= length) {
				String str1 = str.substring(0, length);
				String str2 = str.substring(length, str.length());
				if (map.containsKey(str1)) {
					if (map.get(str1) > 1) {
						map.put(str1, map.get(str1) - 1);
					} else {
						map.remove(str1);
					}
				} else {
					break;
				}
				str = str2;
			}
			if (map.isEmpty()) 
				resultlist.add(list.get(m));
			m++;
		}
		return resultlist;
	}
	
}
