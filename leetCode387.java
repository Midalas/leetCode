
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode387 {

	public static void main(String[] args) throws Exception {
		String s = "leetcodel";
		int x = firstUniqChar(s);
		System.out.println();
	}

	public static int firstUniqChar(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				if (map.get(ch[i]) == 1)
					map.put(ch[i], 2);
			} else {
				map.put(ch[i], 1);
			}
		}
		
		for(int i=0;i<ch.length;i++)
			if(map.get(ch[i])==1)
				return i;

		return -1;
	}

}
