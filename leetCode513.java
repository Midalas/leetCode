package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode513 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int findBottomLeftValue(TreeNode root) {
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		nodeList.add(root);
		while (!nodeList.isEmpty()) {
			List<TreeNode> tempList = new ArrayList<TreeNode>();
			for (TreeNode a : nodeList) {
				if (a.left != null)
					tempList.add(a.left);
				if (a.right != null)
					tempList.add(a.right);
			}
			if (tempList.isEmpty())
				break;
			nodeList = tempList;
		}
		return nodeList.get(0).val;
	}
}
