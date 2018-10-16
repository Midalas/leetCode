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
public class leetCode648 {
	public static void main(String[] args) {

		String[] arr = { "a", "aa", "aaa", "aaaa" };
		List<String> dict = Arrays.asList(arr);
		String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
		String x = replaceWords(dict, sentence);
		System.out.println();
	}

	// runtime 64ms
	public static String replaceWords(List<String> dict, String sentence) {
		StringBuffer res = new StringBuffer();
		String[] arr = sentence.split(" ");
		Collections.sort(dict, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});

		for (int i = 0; i < arr.length; i++) {
			int min = 0;
			String temp = arr[i];
			for (String str : dict) {
				if (temp.startsWith(str)) {
					temp = str;
					break;
				}
			}
			res.append(temp).append(" ");
		}
		return res.substring(0, res.length() - 1);
	}
}
