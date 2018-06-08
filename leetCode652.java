package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode652 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("1,2,3,4,#,2,4,#,#,4,#,#,#");

		findDuplicateSubtrees(root);
		System.out.println();
	}

	public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		Map<String, Integer> set = new HashMap<String, Integer>();
		dfs(result, set, root);
		return result;
	}

	public static void dfs(List<TreeNode> result, Map<String, Integer> map, TreeNode root) {
		if (root == null)
			return;
		String series = leetCode297.serialize(root);
		if (map.containsKey(series)) {
			if (map.get(series) == 1) {
				result.add(root);
				map.put(series, 2);
			}
		} else {
			map.put(series, 1);
		}
		dfs(result, map, root.left);
		dfs(result, map, root.right);
	}

}
