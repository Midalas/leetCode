package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class leetCode748 {
	public static void main(String[] args) throws Exception {
		String licensePlate = "1s3 456";
		String[] words = { "looks", "pest", "stew", "show" };
		String x = shortestCompletingWord(licensePlate, words);
		System.out.println();

	}

	
	//runtime 13ms
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		String res = "";
		int minLength = Integer.MAX_VALUE;
		int[] count = getStrArray(licensePlate);
		for (int i = 0; i < words.length; i++)
			if (words[i].length() < minLength && isContain(count, getStrArray(words[i]))) {
				minLength = words[i].length();
				res = words[i];
			}

		return res;
	}

	private static int[] getStrArray(String str) {
		char[] ch = str.toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				count[ch[i] - 97]++;
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				count[ch[i] - 65]++;
			}
		}
		return count;
	}

	private static boolean isContain(int[] count, int[] temp) {
		for (int i = 0; i < temp.length; i++)
			if (temp[i] < count[i])
				return false;
		return true;
	}

}
