
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode013 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		mp.put('I', 1);
		mp.put('V', 5);
		mp.put('X', 10);
		mp.put('L', 50);
		mp.put('C', 100);
		mp.put('D', 500);
		mp.put('M', 1000);
		int result = 0;
		int i = 0;
		while (i < s.length()) {
			if (i == s.length() - 1) {
				result += mp.get(s.charAt(i));
				i++;
				break;
			}
			if (mp.get(s.charAt(i)) >= mp.get(s.charAt(i + 1))) {
				result += mp.get(s.charAt(i));
				i++;
			} else {
				result -= mp.get(s.charAt(i));
				result += mp.get(s.charAt(i + 1));
				i += 2;
			}
		}
		return result;
	}

}
