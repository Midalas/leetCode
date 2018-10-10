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
public class leetCode905 {
	public static void main(String[] args) {
		int[] A = { 1, 3, 0, 5 };
		int[] x = sortArrayByParity(A);
		System.out.println();
	}
	//runtime 53ms
	public static int[] sortArrayByParity(int[] A) {
		int start = 0;
		int end = A.length - 1;
		int i = 0;
		while (i <= end) {
			if (A[i] % 2 == 0) {
				swap(A, i++, start++);
			}else{
				i++;
			} 
		}
		return A;
	}

	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
