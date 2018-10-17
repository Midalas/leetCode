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
public class leetCode413 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int x = numberOfArithmeticSlices(A);
		System.out.println();
	}

	//runtime 1ms
	public static int numberOfArithmeticSlices(int[] A) {
		int res = 0;
		int count = 1;
		int len = A.length;
		if (len < 3)
			return 0;
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] + A[i] == A[i + 1] + A[i - 1]) {
				res += count++;
			} else {
				count = 1;
			}
		}
		return res;
	}

}
