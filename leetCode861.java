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
public class leetCode861 {
	public static void main(String[] args) {
		int[][] A = { { 0, 1 }, { 1, 1 }, { 1, 1 } };
		int x = matrixScore(A);
		System.out.println();
	}

	// runtime 8ms
	public static int matrixScore(int[][] A) {
		int res = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i][0] == 0)
				for (int j = 0; j < A[0].length; j++)
					A[i][j] = 1 - A[i][j];
		for (int i = 0; i < A[0].length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++)
				if (A[j][i] == 0)
					count++;
			res += Math.pow(2, A[0].length - i - 1) * (count + count > A.length ? count : A.length - count);
		}
		return res;
	}
}
