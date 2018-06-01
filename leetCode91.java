package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode91 {

	public static void main(String[] args) throws Exception {
		String s = "230";
		int x = numDecodings(s);
		System.out.println(x);

	}

	public static int numDecodings(String s) {
		if (s.length() < 1 || s.contains("00") || s.startsWith("0"))
			return 0;
		if (s.length() == 1) {
			return s.charAt(0) == '0' ? 0 : 1;
		}
		int[] a = new int[s.length()];
		int[] b = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i) - 48;
		}
		b[0] = 1;
		if (a[1] == 0 && a[0] > 2) 
			return 0;
		b[1] = a[0] * 10 + a[1] < 27 && a[1] != 0 ? 2 : 1;
		int i = 2;
		while (i < s.length()) {
			if (a[i] == 0) {
				if (a[i - 1] > 2) {
					return 0;
				} else {
					b[i] = b[i - 2];
				}
			} else if (a[i - 1] * 10 + a[i] < 27 && a[i - 1] != 0) {
				b[i] = b[i - 1] + b[i - 2];
			} else {
				b[i] = b[i - 1];
			}
			i++;
		}
		return b[s.length() - 1];
	}
}
