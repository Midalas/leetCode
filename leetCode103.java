package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode103 {

	public static void main(String[] args) throws Exception {

		//  1
		// / \
		// 2 3
		///   \
		//4   5
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);

		zigzagLevelOrder(root);

		System.out.println();
	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<TreeNode> node = new ArrayList<TreeNode>();
		if(root==null)
			return result;
		node.add(root);
		bfs(result, node,0);
		return result;
	}

	private static void bfs(List<List<Integer>> result, List<TreeNode> node,int level) {
		List<Integer> temp = new ArrayList<Integer>();
		List<TreeNode> tempNode = new ArrayList<TreeNode>();
		int size=node.size()-1;
		while(size>=0){
			temp.add(node.get(size).val);
			if(level%2==0){
				if (node.get(size).left != null)
					tempNode.add(node.get(size).left);
				if (node.get(size).right != null)
					tempNode.add(node.get(size).right);
			}else{
				if (node.get(size).right != null)
					tempNode.add(node.get(size).right);
				if (node.get(size).left != null)
					tempNode.add(node.get(size).left);
			}
			size--;
		}
		result.add(temp);
		if (tempNode.isEmpty()) {
			return;
		} else {
			bfs(result, tempNode,level+1);
		}
	}

}
