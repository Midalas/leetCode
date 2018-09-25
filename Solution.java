package leetCode;

import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class Solution {
	Random temp;
	int[] nums;
	public Solution(int[] nums) {
		this.nums = nums;
		this.temp = new Random();
	}

	public int pick(int target) {
		int index = -1;
		int times = 0;
		for (int i = 0; i < nums.length; i++) 
			if (nums[i] == target) 
				if (temp.nextInt(++times) == 0)
					index = i;
		return index;
	}
}
