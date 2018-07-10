
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode003 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int j = 0;
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (mp.containsKey(s.charAt(i))) {
				max = mp.size() > max ? mp.size() : max;
				j = mp.get(s.charAt(i)) + 1;
				mp.clear();
				for (int k = j; k <= i; k++) 
					mp.put(s.charAt(k), k);
			} else {
				mp.put(s.charAt(i), i);
			}
		}
		max = mp.size() > max ? mp.size() : max;
		return max;
	}
}
