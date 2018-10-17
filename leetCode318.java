package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode318 {
	public static void main(String[] args) {
		String[] words = { "a","ab","abc","d","cd","bcd","abcd" };
		int x = maxProduct(words);
		System.out.println();
	}

	//runtime 211ms
	public static int maxProduct(String[] words) {
		int res = 0;
		for (int i = 0; i < words.length; i++) {
			int len1 = words[i].length();
			for (int j = i + 1; j < words.length; j++)
				if (len1 * words[j].length() > res && isVaild(words[i], words[j]))
					return len1 * words[j].length();
		}
		return res;
	}

	private static boolean isVaild(String str1, String str2) {
		boolean[] arr = new boolean[128];
		for (int i = 0; i < str1.length(); i++)
			if (!arr[str1.charAt(i)])
				arr[str1.charAt(i)] = true;
		for (int i = 0; i < str2.length(); i++)
			if (arr[str2.charAt(i)])
				return false;
		return true;
	}
}
