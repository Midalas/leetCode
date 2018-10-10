package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class leetCode893 {
	public static void main(String[] args) {
		String[] A = { "abc","acb","bac","bca","cab","cba"};
		int x = numSpecialEquivGroups(A);
		System.out.println(getFixStr("jihgfedcba"));
	}

	//runtime 8ms
	public static int numSpecialEquivGroups(String[] A) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < A.length; i++) {
			String temp = getFixStr(A[i]);
			map.put(temp, 1);
		}

		return map.size();
	}

	private static String getFixStr(String str) {
		char[] ch = str.toCharArray();
		int len2 = ch.length / 2;
		int len1 = ch.length - len2;
		char[] ch1 = new char[len1];
		char[] ch2 = new char[len2];
		for (int i = 0; i + i < ch.length; i++)
			ch1[i] = ch[i + i];
		for (int i = 0; i + i + 1 < ch.length; i++)
			ch2[i] = ch[i + i + 1];
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return new String(ch1) + new String(ch2);
	}
}
