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
public class leetCode80 {

	public static void main(String[] args) throws Exception {
		int[] nums = {};
		removeDuplicates(nums);
		System.out.println();

	}

	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		int same = 0;
		if (nums.length < 1)
			return 0;
		int lastnum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == lastnum) {
				if (same < 1) {
					same++;
				} else {
					nums[i] = Integer.MAX_VALUE;
					length--;
				}
			} else {
				lastnum = nums[i];
				same = 0;
			}
		}
		Arrays.sort(nums);
		return length;
	}
}
