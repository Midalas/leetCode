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
public class leetCode647 {
	public static void main(String[] args) {
		String s = "abc";
		int x=countSubstrings(s);
		System.out.println();
	}

	//runtime 10ms
	public static int countSubstrings(String s) {
		int res = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			res += getMaxLength(ch, i);
		}
		return res;
	}

	private static int getMaxLength(char[] ch, int index) {
		int res = 0;
		int count = 0;
		while (index - count - 1 >= 0 && index + count < ch.length) {
			if (ch[index - 1 - count] == ch[index + count]) {
				count++;
			}else{
				break;
			}
		}
		res+=count;
		count = 1;
		while (index - count >= 0 && index + count < ch.length) {
			if (ch[index - count] == ch[index + count]) {
				count++;
			} else {
				break;
			}
		}
		return res+count;
	}
}
