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
public class leetCode763 {
	public static void main(String[] args) {

		String S = "ababcbacadefegdehijhklij";
		List<Integer> x = partitionLabels(S);
		System.out.println();
	}

	//runtime 20ms
	public static List<Integer> partitionLabels(String S) {
		List<Integer> res = new ArrayList<Integer>();
		char[] ch = S.toCharArray();
		int start = 0;
		while (start < ch.length) {
			int end = getLastIndex(ch, start);
			for (int i = start; i < end; i++)
				if (getLastIndex(ch, i) > end)
					end = S.lastIndexOf(ch[i]);

			res.add(end - start + 1);
			start = end + 1;
		}

		return res;
	}

	private static int getLastIndex(char[] ch, int index) {
		for (int i = ch.length - 1; i >= 0; i--)
			if (ch[i] == ch[index])
				return i;
		return -1;
	}

}
