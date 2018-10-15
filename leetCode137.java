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
public class leetCode137 {
	public static void main(String[] args) {
		int[] nums={0,1,0,1,0,1,99};
		int x=singleNumber(nums);
		System.out.println();
	}

	//runtime 11ms
	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			int count = 0;
			int mask = 1 << i;
			for (int j = 0; j < nums.length; j++) {
				if ((nums[j] & mask) != 0) {
					count++;
				}
			}
			if (count % 3 != 0)
				res |= mask;
		}
		return res;
	}

}
