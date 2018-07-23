
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode438 {

	public static void main(String[] args) throws Exception {
		String s = "abab";
		String p = "ab";
		List<Integer> x = findAnagrams(s, p);
		System.out.println();
	}

	// runtime 12ms
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<Integer>();
		int[] countp = new int[200];
		int[] counts = new int[200];
		char[] chp = p.toCharArray();
		char[] chs = s.toCharArray();
		if (chs.length < chp.length)
			return res;
		for (int i = 0; i < chp.length; i++) {
			countp[chp[i]] += 1;
			counts[chs[i]] += 1;
		}
		int samecount = checkSameCount(counts, countp);
		for (int i = chp.length; i < chs.length; i++) {
			if (samecount == 26)
				res.add(i - chp.length);
			if (counts[chs[i]] == countp[chs[i]]) {
				samecount--;
			} else if (counts[chs[i]] + 1 == countp[chs[i]]) {
				samecount++;
			}
			counts[chs[i]] += 1;
			if (counts[chs[i - chp.length]] == countp[chs[i - chp.length]]) {
				samecount--;
			} else if (counts[chs[i - chp.length]] - 1 == countp[chs[i - chp.length]]) {
				samecount++;
			}

			counts[chs[i - chp.length]] -= 1;
		}
		if (samecount == 26)
			res.add(chs.length - chp.length);

		return res;
	}

	private static int checkSameCount(int[] counts, int[] countp) {
		int count = 0;
		for (int i = 97; i <= 122; i++)
			if (counts[i] == countp[i])
				count++;
		return count;
	}
	
	
	//runtime 161ms
	public static List<Integer> findAnagrams1(String s, String p) {
		List<Integer> res = new ArrayList<Integer>();
		int[] countp = new int[200];
		int[] counts = new int[200];
		char[] chp = p.toCharArray();
		char[] chs = s.toCharArray();
		if (chs.length < chp.length)
			return res;
		for (int i = 0; i < chp.length; i++) {
			countp[chp[i]] += 1;
			counts[chs[i]] += 1;
		}
		for (int i = chp.length; i < chs.length; i++) {
			if (checkSameCount1(counts, countp))
				res.add(i - chp.length);
			counts[chs[i]] += 1;
			counts[chs[i - chp.length]] -= 1;
		}
		if (checkSameCount1(counts, countp))
			res.add(chs.length - chp.length);

		return res;
	}

	private static boolean checkSameCount1(int[] counts, int[] countp) {
		for (int i = 97; i <= 122; i++)
			if (counts[i] != countp[i])
				return false;
		return true;
	}
}
