package leetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class leetCode084 {

	public static void main(String[] args) throws Exception {
		// int[] heights = { 2, 2, 5, 6, 2, 2, 2 };
		int[] heights = { 0, 1, 1, 1 };
		largestRectangleArea(heights);
		System.out.println();
	}

	public static int largestRectangleArea(int[] height) {
		if (height == null || height.length == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int result = 0;
		for (int i = 0; i < height.length; i++) {
			if (stack.empty() || height[i] >= stack.peek()) {
				stack.push(height[i]);
			} else {
				int count = 0;
				while (!stack.empty() && stack.peek() > height[i]) {
					count++;
					result = Math.max(result, stack.peek() * count);
					stack.pop();
				}
				while (count > 0) {
					stack.push(height[i]);
					count--;
				}
				stack.push(height[i]);
			}
		}
		int count = 1;
		while (!stack.empty()) {
			result = Math.max(result, stack.peek() * count);
			stack.pop();
			count++;
		}
		return result;
	}
	//超时
	public static int largestRectangleArea1(int[] heights) {
		Set<Integer> set = new HashSet<Integer>();
		int result = 0;
		for (int i = 0; i < heights.length; i++) {
			if (!set.contains(heights[i])) {
				set.add(heights[i]);
				int maxlength = 1;
				int count = 0;
				for (int j = 0; j < heights.length; j++) {
					if (heights[j] >= heights[i]) {
						count++;
					} else {
						maxlength = count > maxlength ? count : maxlength;
						count = 0;
					}
				}
				maxlength = count > maxlength ? count : maxlength;
				result = maxlength * heights[i] > result ? maxlength * heights[i] : result;
			}
		}
		return result;
	}
}
