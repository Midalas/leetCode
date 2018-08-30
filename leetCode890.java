
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode890 {

	public static void main(String[] args) throws Exception {


		String[] words = { "abc", "deq", "mee", "aqq", "dkd", "ccc" };
		String pattern = "abb";

		List<String> x = findAndReplacePattern(words, pattern);
		System.out.println("");
	}

	//runtime 7ms
	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < words.length; i++)
			if (checkSamePattern(words[i], pattern))
				res.add(words[i]);
		return res;
	}

	private static boolean checkSamePattern(String s, String pattern) {
		Map<Character, Character> map1 = new HashMap<Character, Character>();
		Map<Character, Character> map2 = new HashMap<Character, Character>();
		char[] ch1 = s.toCharArray();
		char[] ch2 = pattern.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			if (!map1.containsKey(ch2[i])) {
				if (map2.containsKey(ch1[i]))
					return false;
				map1.put(ch2[i], ch1[i]);
				map2.put(ch1[i], ch2[i]);
			} else if (map1.get(ch2[i]) != ch1[i])
				return false;
		}
		return true;
	}
}
