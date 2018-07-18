
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode205 {

	public static void main(String[] args) throws Exception {

		String s = "baaa";
		String t = "caaa";

		boolean x = isIsomorphic(s, t);

		System.out.println();
	}

	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> s2t = new HashMap<Character, Character>();
		Map<Character, Character> t2s = new HashMap<Character, Character>();
		char[] ch_s = s.toCharArray();
		char[] ch_t = t.toCharArray();
		for (int i = 0; i < ch_s.length; i++) {
			if (s2t.containsKey(ch_s[i])) {
				if (ch_t[i] != s2t.get(ch_s[i]))
					return false;
			} else {
				if (!t2s.containsKey(ch_t[i])) {
					s2t.put(ch_s[i], ch_t[i]);
					t2s.put(ch_t[i], ch_s[i]);
				} else
					return false;
			}
		}
		return true;
	}
}
