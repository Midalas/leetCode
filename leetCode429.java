
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode429 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	// runtime 11ms
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Node> local = new ArrayList<Node>();
		if (root == null)
			return res;
		local.add(root);
		while (!local.isEmpty()) {
			List<Node> tempNode = new ArrayList<Node>();
			List<Integer> tempValue = new ArrayList<Integer>();
			for (Node n : local) {
				tempValue.add(n.val);
				for (Node c : n.children)
					tempNode.add(c);
			}
			local = tempNode;
			res.add(tempValue);
		}
		return res;
	}

}
