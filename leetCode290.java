
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode290 {

	public static void main(String[] args) throws Exception {

		String pattern = "abba";
		String str = "dog dog dog dog";

		boolean x = wordPattern(pattern, str);

		System.out.println();
	}

	public static boolean wordPattern(String pattern, String str) {
		char[] ch1 = pattern.toCharArray();
		String[] ch2 = str.split(" ");
		if (ch1.length != ch2.length)
			return false;
		Map<Character, String> map1 = new HashMap<Character, String>();
		Map<String, Character> map2 = new HashMap<String, Character>();
		for (int i = 0; i < ch1.length; i++) {
			if (map1.containsKey(ch1[i])) {
				if (!map1.get(ch1[i]).equals(ch2[i]))
					return false;
			} else {
				if (!map2.containsKey(ch2[i])) {
					map1.put(ch1[i], ch2[i]);
					map2.put(ch2[i], ch1[i]);
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
