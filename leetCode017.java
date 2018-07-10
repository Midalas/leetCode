
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode017 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public List<String> letterCombinations(String digits) {
		String[] temp = new String[0];
		String[] temp0 = new String[0];		
		String[] temp2 =new String[0];
		String[] c2 = { "a", "b", "c" };
		String[] c3 = { "d", "e", "f" };
		String[] c4 = { "g", "h", "i" };
		String[] c5 = { "j", "k", "l" };
		String[] c6 = { "m", "n", "o" };
		String[] c7 = { "p", "q", "r", "s" };
		String[] c8 = { "t", "u", "v" };
		String[] c9 = { "w", "x", "y", "z" };

		List<String> backlist = new ArrayList<String>();
		Map<Character, String[]> mp = new HashMap<Character, String[]>();
		mp.put('2', c2);
		mp.put('3', c3);
		mp.put('4', c4);
		mp.put('5', c5);
		mp.put('6', c6);
		mp.put('7', c7);
		mp.put('8', c8);
		mp.put('9', c9);

		int i = 0;
		while (i < digits.length()) {
			if (digits.charAt(i) <= '9' && digits.charAt(i) >= '2') {
				temp = mp.get(digits.charAt(i));
				if (temp0.length > 0) {
					temp2 = new String[temp0.length * temp.length];
				} else {
					temp0 = temp;
					temp2 = temp;
					i++;
					continue;
				}
				for (int j = 0; j < temp.length; j++) {
					for (int k = 0; k < temp0.length; k++) 
						temp2[j * temp0.length + k] =  temp0[k] + temp[j];
				}
				temp0=temp2;
			}
			i++;
		}
		for (int m = 0; m < temp2.length; m++) 
			backlist.add(temp2[m]);

		return backlist;
	}
}
