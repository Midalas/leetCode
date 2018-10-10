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
public class leetCode888 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 5 };
		int[] B = { 2, 4 };
		int[] x = fairCandySwap(A, B);
		System.out.println();
	}

	//runtime 54ms
	public static int[] fairCandySwap(int[] A, int[] B) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] res = { 0, 0 };
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], i);
			sumA += A[i];
		}
		for (int i = 0; i < B.length; i++)
			sumB += B[i];
		int lack = (sumA - sumB) / 2;
		for (int i = 0; i < B.length; i++) {
			if (map.containsKey(B[i] + lack)) {
				res[0] = B[i] + lack;
				res[1] = B[i];
				return res;
			}
		}

		return res;
	}

}
