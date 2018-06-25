package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode297 {

	public static void main(String[] args) throws Exception {
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.right.left = new TreeNode(4);
//		root.right.right = new TreeNode(5);

		 TreeNode root=null;
		String x = serialize(root);

		TreeNode result = deserialize(x);

		System.out.println(result);
	}
	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		List<TreeNode> tempList = new ArrayList<TreeNode>();
		StringBuffer s = new StringBuffer();
		tempList.add(root);
		while (!tempList.isEmpty()) {
			List<TreeNode> tempNode = new ArrayList<TreeNode>();
			StringBuffer temp = new StringBuffer();
			for (TreeNode a : tempList) {
				if (a == null) {
					temp.append("#,");
				} else {
					temp.append(a.val + ",");
					tempNode.add(a.left);
					tempNode.add(a.right);
				}
			}
			tempList = tempNode;
			if (!tempList.isEmpty())
				s.append(temp);
		}
		return s.toString();
	}

	// Decodes your encoded data to tree.
	public static TreeNode deserialize(String data) {
		List<TreeNode> tempList = new ArrayList<TreeNode>();	
		String[] array = data.split(",");
		if ("".equals(data))
			return null;	
		TreeNode root = new TreeNode(new Integer(array[0]));
		tempList.add(root);
		int i = 1;
		while (i < array.length) {
			List<TreeNode> tempNode = new ArrayList<TreeNode>();
			for (TreeNode a : tempList) {
				if (array[i].equals("#")) {
					a.left = null;
				} else {
					a.left = new TreeNode(new Integer(array[i]));
					tempNode.add(a.left);
				}
				i++;
				if (array[i].equals("#")) {
					a.right = null;
				} else {
					a.right = new TreeNode(new Integer(array[i]));
					tempNode.add(a.right);
				}
				i++;
			}
			tempList = tempNode;
		}
		return root;
	}

}
