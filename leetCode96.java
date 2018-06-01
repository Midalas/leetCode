package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode96 {

	public static void main(String[] args) throws Exception {
		int n = 3;
		int x=numTrees(n);
		System.out.println(x);
	}

	public static int numTrees(int n) {
		int[] nums = new int[n + 1];
		nums[0] = 1;
		for (int i = 1; i <= n; i++) {
			int temp = 0;
			for (int j = 1; j <= i; j++) {
				temp += nums[j - 1] * nums[i - j];
			}
			nums[i] = temp;
		}
		return nums[n];
	}

}
