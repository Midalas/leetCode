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
public class leetCode540 {
	public static void main(String[] args) {
		int[] nums = { 3 };
		int x = singleNonDuplicate(nums);
		System.out.println();
	}

	//runtime 1ms
	public static int singleNonDuplicate(int[] nums) {
		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1])
				return nums[i];
		}
		return nums[nums.length - 1];
	}
}
