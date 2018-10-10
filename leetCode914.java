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
public class leetCode914 {
	public static void main(String[] args) {
		int[] deck = { 1, 1, 1, 2, 2, 2, 3, 3 };
		boolean x = hasGroupsSizeX(deck);
		System.out.println();
	}

	//runtime 26ms
	public static boolean hasGroupsSizeX(int[] deck) {
		int temp = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < deck.length; i++) {
			temp = deck[i];
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		int groupSize = map.get(temp);
		for (Integer i : map.values()) {
			groupSize = gcd(groupSize, i);
			if (groupSize < 2)
				return false;
		}

		return true;
	}

	// 求最大公约数
	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
