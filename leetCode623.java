package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode623 {

	public static void main(String[] args) throws Exception {
		// TreeNode root = leetCode297.deserialize("4,2,3,1,5,2,7");
		// TreeNode result = addOneRow(root, 1, 77);
		// TreeNode root = leetCode297.deserialize("4,2,6,3,1,5,#");
		// TreeNode result = addOneRow(root, 1, 2);

		TreeNode root = leetCode297.deserialize("4,2,#,3,1");
		TreeNode x = addOneRow(root, 1, 2);
		System.out.println(x);
	}

	public static TreeNode addOneRow(TreeNode root, int v, int d) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		if (d == 1) {
			TreeNode p = new TreeNode(v);
			p.left = root;
			return p;
		}
		//获得d-1层级的所有节点
		while (d > 2 && !list.isEmpty()) {
			List<TreeNode> result = new ArrayList<TreeNode>();
			for (TreeNode t : list) {
				if (t.left != null)
					result.add(t.left);
				if (t.right != null)
					result.add(t.right);
			}
			list = result;
			d--;
		}
		//在第d层增加值为v的节点
		for (TreeNode t : list) {
			TreeNode p1 = new TreeNode(v);
			p1.left = t.left;
			t.left = p1;
			TreeNode p2 = new TreeNode(v);
			p2.right = t.right;
			t.right = p2;
		}
		return root;
	}

}
