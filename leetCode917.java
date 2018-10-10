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
public class leetCode917 {
	public static void main(String[] args) {
		String S = "7_28]";
		String x = reverseOnlyLetters(S);
		System.out.println();
	}

	//runtime 24ms
	public static String reverseOnlyLetters(String S) {
		char[] ch = S.toCharArray();
		int start = 0;
		int end = ch.length - 1;
		while (start < end) {
			while (start < end && !judgeLetters(ch[start])) {
				start++;
			}
			while (start < end && !judgeLetters(ch[end])) {
				end--;
			}
			swap(ch, start++, end--);
		}
		return new String(ch);
	}

	private static void swap(char[] ch, int start, int end) {
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
	}

	private static boolean judgeLetters(char c) {
		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
	}
}
