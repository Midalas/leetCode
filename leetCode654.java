package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode654 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,2,5,3,#,#,#,4,#");

		int nums[] = { 3, 2, 1, 6, 0, 5 };
		root = constructMaximumBinaryTree(nums);
		System.out.println();

	}
	public static TreeNode constructMaximumBinaryTree(int[] nums) {
		if(nums.length<1)
			return null;
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		TreeNode root = new TreeNode(max);
		root.left = dfs(root, nums, 0, index - 1);
		root.right = dfs(root, nums, index + 1, nums.length - 1);
		return root;

	}

	private static TreeNode dfs(TreeNode root, int nums[], int start, int end) {
		int max = Integer.MIN_VALUE;
		int index = -1;
		if (start == end) {
			return new TreeNode(nums[start]);
		} else if (start > end) {
			return null;
		}
		for (int i = start; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		TreeNode p = new TreeNode(max);
		p.left = dfs(p, nums, start, index - 1);
		p.right = dfs(p, nums, index + 1, end);
		return p;
	}

}
