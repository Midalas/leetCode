package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode199 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,2,3,#,5,#,4");
		List<Integer> x = rightSideView(root);
		System.out.println();

	}

	//迭代
	public static List<Integer> rightSideView(TreeNode root) {
		if(root==null)
			return new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		nodeList.add(root);
		while (!nodeList.isEmpty()) {
			result.add(nodeList.get(nodeList.size() - 1).val);
			List<TreeNode> tempList = new ArrayList<TreeNode>();
			for (TreeNode p : nodeList) {
				if (p.left != null)
					tempList.add(p.left);
				if (p.right != null)
					tempList.add(p.right);
			}
			nodeList = tempList;
		}
		return result;
	}
	
	//递归
    public static List<Integer> rightSideView_1(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }
    
    private static void dfs(TreeNode x, int lvl, List<Integer> res) {
        if (lvl == res.size()) 
        	res.add(x.val);
        if (x.right != null) 
        	dfs(x.right, lvl+1, res);
        if (x.left != null) 
        	dfs(x.left, lvl+1, res);
    }

}
