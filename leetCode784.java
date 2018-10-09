package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode784 {
	public static void main(String[] args) {
		String S = "a1b2";
		List<String> x = letterCasePermutation(S);
		System.out.println();
	}

	//runtime 12ms
	public static List<String> letterCasePermutation(String S) {
		List<String> res = new ArrayList<String>();
		int len = S.length();
		res.add(S);
		for (int i = 0; i < len; i++) {
			if (S.charAt(i) > '9') {
				int size = res.size();
				for (int j = 0; j < size; j++) {
					String Sj = res.get(j);
					if (S.charAt(i) < 'a') {
						res.add(Sj.substring(0, i) + (char) (Sj.charAt(i) + 32) + Sj.substring(i + 1, len));
					} else {
						res.add(Sj.substring(0, i) + (char) (Sj.charAt(i) - 32) + Sj.substring(i + 1, len));
					}
				}
			}
		}
		return res;
	}

}
