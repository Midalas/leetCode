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
public class leetCode553 {
	public static void main(String[] args) {
		int[] nums = { 1000, 100, 10, 2 };
		// 输出: "1000/(100/10/2)"
		String x = optimalDivision(nums);
		System.out.println();
	}

	//runtime 8ms
	public static String optimalDivision(int[] nums) {
		if (nums.length < 2) {
			return "" + nums[0];
		} else if (nums.length == 2) {
			return nums[0] + "/" + nums[1];
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < nums.length - 1; i++)
			sb.append(nums[i]).append('/');
		sb.append(nums[nums.length - 1]);
		sb.insert(0, nums[0] + "/(").append(")");
		return sb.toString();
	}

}
