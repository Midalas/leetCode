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
public class leetCode442 {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> x = findDuplicates(nums);
		System.out.println();
	}

	//runtime 15ms
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		int[] temp = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			if (temp[nums[i]] == 1) {
				res.add(nums[i]);
			} else {
				temp[nums[i]] = 1;
			}
		}
		return res;
	}
}
