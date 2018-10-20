package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
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
public class leetCode462 {

	public static void main(String[] args) throws Exception {
		int[] nums={1,0,0,8,6};
		int x=minMoves2(nums);
		System.out.println();
	}
	//runtime 6ms
	public static int minMoves2(int[] nums) {
		int res=0;
		Arrays.sort(nums);
		int average = nums[nums.length/2];
		for (int i = 0; i < nums.length; i++)
			res += Math.abs(average - nums[i]);
		return res;
	}

}
