package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode515 {

	public static void main(String[] args) throws Exception {
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(2);
		root.right=new TreeNode(-5);
		
		List<Integer> x=largestValues(root);
		System.out.println();
	}
	//二叉树层次遍历 leetCode102
	public static List<Integer> largestValues(TreeNode root) {
		List<Integer> result=new ArrayList<Integer>();
		List<List<Integer>> temp=levelOrder(root);
		for(List<Integer> list:temp){
			int max=Integer.MIN_VALUE;
			for(Integer a:list){
				max=a>max?a:max;
			}
			result.add(max);
		}
		return result;
    }
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<TreeNode> node = new ArrayList<TreeNode>();
		if(root==null)
			return result;
		node.add(root);
		bfs(result, node);
		return result;
	}

	private static void bfs(List<List<Integer>> result, List<TreeNode> node) {
		List<Integer> temp = new ArrayList<Integer>();
		List<TreeNode> tempNode = new ArrayList<TreeNode>();
		for (TreeNode a : node) {
			temp.add(a.val);
			if (a.left != null)
				tempNode.add(a.left);
			if (a.right != null)
				tempNode.add(a.right);
		}
		result.add(temp);
		if (tempNode.isEmpty()) {
			return;
		} else {
			bfs(result, tempNode);
		}
	}

}
