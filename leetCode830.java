
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode830 {

	public static void main(String[] args) throws Exception {
		String S = "aaa";
		List<List<Integer>> x = largeGroupPositions(S);

		System.out.println();
	}

	//runtime 16ms
	public static List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		char[] ch = S.toCharArray();
		int firstIndex = 0;
		char nowchar = ' ';
		int i = 0;
		while (i < ch.length) {
			if (ch[i] != nowchar) {
				if (i - firstIndex > 2) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(firstIndex);
					temp.add(i - 1);
					res.add(temp);
				}
				nowchar = ch[i];
				firstIndex = i;
			}
			i++;
		}

		if (i - firstIndex > 2) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(firstIndex);
			temp.add(i - 1);
			res.add(temp);
		}

		return res;
	}
}
