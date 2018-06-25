package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode637 {
	
	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("5,3,6,2,4,#,7");
		List<Double> x=averageOfLevels(root);
		
		System.out.println(x);

	}
	

	public static List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<Double>();
		if (root == null) {
			result.add(0.0);
			return result;
		}
		List<TreeNode> levelList = new ArrayList<TreeNode>();
		levelList.add(root);
		while (!levelList.isEmpty()) {
			List<TreeNode> tempList = new ArrayList<TreeNode>();
			int count = 0;
			double sum = 0.0;
			for (TreeNode p : levelList) {
				sum += p.val;
				count++;
				if (p.left != null)
					tempList.add(p.left);
				if (p.right != null)
					tempList.add(p.right);
			}
			levelList = tempList;
			result.add(sum / count);
		}

		return result;
	}

}
