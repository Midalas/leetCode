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
public class leetCode791 {
	public static void main(String[] args) {
		String S="cba";
		String T="abcd";
		String x=customSortString(S, T);
		System.out.println();
	}

	//runtime 3ms
	public static String customSortString(String S, String T) {
		StringBuffer sb = new StringBuffer();
		int[] count = new int[128];
		char[] cht = T.toCharArray();
		for (int i = 0; i < cht.length; i++)
			count[cht[i]]++;
		for (int i = 0; i < S.length(); i++) {
			char t = S.charAt(i);
			for (int j = 0; j < count[t]; j++)
				sb.append(t);
			count[t] = 0;
		}
		for (int i = 97; i < 123; i++) {
			char t = (char) i;
			for (int j = 0; j < count[i]; j++)
				sb.append(t);
		}
		return sb.toString();
	}
}
