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
public class leetCode921 {
	public static void main(String[] args) {
		String S = "()";
		int x = minAddToMakeValid(S);
		System.out.println();
	}

	// runtime 7ms
	public static int minAddToMakeValid(String S) {
		char[] ch = S.toCharArray();
		int res = 0;
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(') {
				count++;
			} else {
				if (count > 0) {
					count--;
				} else {
					res++;
				}
			}
		}
		return res + count;
	}
}
