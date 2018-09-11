
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode299 {

	public static void main(String[] args) throws Exception {
		String secret = "1123";
		String guess = "0111";
		String x = getHint(secret, guess);
		System.out.println("");
	}

	// 10ms
	public static String getHint(String secret, String guess) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int countA = 0;
		int countB = 0;
		int len = secret.length();
		for (int i = 0; i < len; i++) {
			char s = secret.charAt(i);
			char g = guess.charAt(i);
			if (s == g) {
				countA++;
			} else {
				if (map.containsKey(s)) {
					if (map.get(s) < 0)
						countB++;
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
				if (map.containsKey(g)) {
					if (map.get(g) > 0)
						countB++;
					map.put(g, map.get(g) - 1);
				} else {
					map.put(g, -1);
				}
			}
		}
		return countA + "A" + countB + "B";
	}
}
