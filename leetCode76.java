package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode76 {

	public static void main(String[] args) throws Exception {

		 String s = "a";
		 String t = "aa";
//		 String s = "bbaa";
//		 String t = "aba";
//		 String s = "acbdbaab";
//		 String t = "aabd";
//		String s = "ADOBECODEBANCAXXBB";
//		String t = "ABC";
		String x = minWindow(s, t);
		System.out.println(x);
	}

	public static String minWindow(String s, String t) {
		int[] a = new int[128];
		int[] b = new int[128];
		int length = s.length();
		int resultmin = 0;
		int resultmax = s.length();
		String result = "";
		for (int i = 0; i < t.length(); i++) {
			b[t.charAt(i)]++;
		}
		int size = 0;
		int start = 0;
		for (int i = start; i < s.length(); i++) {
			a[s.charAt(i)]++;
			if (a[s.charAt(i)] <= b[s.charAt(i)]) {
				size++;
			}
			if (size == t.length()) {
				while (start < i && a[s.charAt(start)] > b[s.charAt(start)]) {
					a[s.charAt(start)]--;
					start++;
				}
				if (i - start < length) {
					length = i - start + 1;
					resultmin = start;
					resultmax = i;
					result = s.substring(resultmin, resultmax + 1);
				}
				a[s.charAt(start++)]--;
				size--;
			}

		}
		return result;
	}

	// 此方法超时
	public static String minWindow1(String s, String t) {
		int j = 0;
		int length = s.length();
		String result = "";
		for (int i = 0; i < t.length(); i++) {
			if (s.length() < t.length() || s.indexOf(t.charAt(i)) == -1)
				return "";
		}
		while (j < s.length()) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			int min = s.length() - 1;
			int max = 0;
			for (int i = 0; i < t.length(); i++) {
				char temp = t.charAt(i);
				int index = map.containsKey(temp) ? map.get(temp) + 1 : j;
				min = s.indexOf(temp, index) < min ? s.indexOf(temp, index) : min;
				max = s.indexOf(temp, index) > max ? s.indexOf(temp, index) : max;
				map.put(temp, s.indexOf(temp, s.indexOf(temp, index)));
				if (s.indexOf(temp, index) == -1) {
					return result;
				}
			}
			if (max - min < length) {
				length = max - min;
				result = s.substring(min, max + 1);
			}
			j = min + 1;
		}
		return result;
	}

}
