
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode819 {

	public static void main(String[] args) throws Exception {
		String paragraph = "a.";
		String[] banned = {};

		String x = mostCommonWord(paragraph, banned);
		System.out.println();
	}

	//runtime 15ms
	public static String mostCommonWord(String paragraph, String[] banned) {
		String res = "";
		int max = 0;
		String[] arr = paragraph.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String temp = getRealWord(arr[i]);
			if (!isBanned(banned, temp)) {
				int times = map.containsKey(temp) ? map.get(temp) + 1 : 1;
				if (times > max) {
					res = temp;
					max = times;
				}
				map.put(temp, times);
			}
		}

		return res;
	}

	private static String getRealWord(String str) {
		char lastchar = str.charAt(str.length() - 1);
		if (lastchar == '!' || lastchar == '?' || lastchar == '\'' || lastchar == ',' || lastchar == ';'
				|| lastchar == '.')
			str = str.substring(0, str.length() - 1);
		return str.toLowerCase();
	}

	private static boolean isBanned(String[] banned, String str) {
		for (int i = 0; i < banned.length; i++)
			if (banned[i].equals(str))
				return true;
		return false;
	}

}
