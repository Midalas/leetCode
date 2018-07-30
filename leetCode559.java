
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode559 {

	public static void main(String[] args) throws Exception {
		System.out.println();
	}
	// runtime 3ms
	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		int depth = 0;
		if (root.children != null && root.children.size() > 0)
			for (Node tem : root.children)
				depth = Math.max(depth, maxDepth(tem));
		return 1 + depth;
	}

	// runtime 10ms
	public static int maxDepth1(Node root) {
		if (root == null)
			return 0;
		int level = 0;
		List<Node> localList = new ArrayList<Node>();
		localList.add(root);
		while (!localList.isEmpty()) {
			List<Node> tempList = new ArrayList<Node>();
			for (Node n : localList)
				for (Node c : n.children)
					tempList.add(c);
			localList = tempList;
			level++;
		}
		return level;
	}
}
