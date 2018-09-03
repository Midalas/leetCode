
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode187 {

	public static void main(String[] args) throws Exception {
		String s = "AAAAAAAAAAAA";
		List<String> res = findRepeatedDnaSequences(s);

		System.out.println("");
	}

	//runtime 82ms
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<String>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < s.length() - 9; i++) {
			int temp = getVal(s.substring(i, i + 10));
			if (map.containsKey(temp)) {
				if (map.get(temp) < 1){
					map.put(temp, 1);
					res.add(s.substring(i, i + 10));
				}		
			} else {
				map.put(temp, 0);
			}
		}
		return res;
	}

	private static int getVal(String s) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			char c = s.charAt(i);
			int num = 0;
			switch (c) {
			case 'A':
				num = 0;
				break;
			case 'C':
				num = 1;
				break;
			case 'G':
				num = 2;
				break;
			case 'T':
				num = 3;
				break;
			}
			count += (num << 2 * i);
		}
		return count;
	}
}
