package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode958 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("1,2,3,4,5,6,7,8,9,10,11,12,13,#,#,15,#,#,#,#,#,#,#,#,#,#,#");
		boolean x = isCompleteTree(root);
		System.out.println();
	}

	//runtime 6ms
	public static boolean isCompleteTree(TreeNode root) {
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		nodeList.add(root);
		while (!nodeList.isEmpty()) {
			List<TreeNode> tempList = new ArrayList<TreeNode>();
			for (int i = 0; i < nodeList.size(); i++) {
				TreeNode node = nodeList.get(i);
				if (null != node.left)
					tempList.add(node.left);
				if (null != node.right)
					tempList.add(node.right);
			}
			if (tempList.size() == 2 * nodeList.size()) {
				nodeList = tempList;
			} else {
				int count = 0;
				for (TreeNode node : nodeList) {
					if (null != node.left && null != node.right) {
						count += 2;
					} else {
						if (null != node.left && null == node.right)
							count += 1;
						break;
					}
				}
				for (TreeNode node : tempList)
					if (null != node.left || null != node.right)
						return false;
				return tempList.size() == count;
			}
		}
		return true;
	}
}
