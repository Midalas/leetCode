package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode508 {

	public static void main(String[] args) throws Exception {
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(2);
		root.right=new TreeNode(-5);
		
		int[] x=findFrequentTreeSum(root);
		System.out.println(x);
	}
	
	
	private static int max = 0;
	private static int count = 0;
	
	//类似leetCode501
	public static int[] findFrequentTreeSum(TreeNode root) {
		max = 0;
		count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		dfs(map, root);
		int[] res = new int[count];
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				res[i] = entry.getKey();
				i++;
			}
		}
		return res;
    }
	private static void dfs(Map<Integer, Integer> map, TreeNode root) {
		if (root == null)
			return;
		if (root.left != null)
			dfs(map, root.left);
		int subTreeSum=subTreeSum(root);
		if (map.get(subTreeSum) == null) {
			map.put(subTreeSum, 1);
			max = 1 > max ? 1 : max;
			if (max == 1)
				count++;
		} else {
			if (map.get(subTreeSum) + 1 > max) {
				max = map.get(subTreeSum) + 1;
				count = 1;		
			} else if (map.get(subTreeSum) + 1 == max) {
				count++;
			}
			map.replace(subTreeSum, map.get(subTreeSum) + 1);
		}
		if (root.right != null)
			dfs(map, root.right);
	}
	
	
	private static int subTreeSum(TreeNode root){
		if(root==null)
			return 0;
		return root.val+subTreeSum(root.left)+subTreeSum(root.right);
	}
}
