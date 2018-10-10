package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode872 {
	public static void main(String[] args) {
		TreeNode root1 = leetCode297.deserialize("1");
		TreeNode root2 = leetCode297.deserialize("2");

		boolean x = leafSimilar(root1, root2);
		System.out.println();
	}

	//runtime 5ms
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		Queue<Integer> queue = new LinkedList<Integer>();
		dfs(queue, root1);
		judge(queue,root2);
		return queue.isEmpty();
	}

	private static void dfs(Queue<Integer> queue, TreeNode root) {
		if (root == null) {
			return;
		} else if (null == root.left && null == root.right) {
			queue.offer(root.val);
		} else {
			dfs(queue, root.left);
			dfs(queue, root.right);
		}
	}

	private static boolean judge(Queue<Integer> queue, TreeNode root) {
		if (root == null) {
			return true;
		} else if (null == root.left && null == root.right) {
			if (queue.isEmpty() || root.val != queue.peek()){
				return false;
			}else{
				queue.remove();
			}
				
		}
		return judge(queue, root.left) && judge(queue, root.right);
	}

}
