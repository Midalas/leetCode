package leetCode;

import java.util.LinkedList;

public class leetCode222 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,2,3,4,#,#,#");
		int x = countNodes(root);
		System.out.println();

	}

	//递归解
	public static int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		int left = getLeftHeight(root.left);
		int right = getRightHeight(root.right);
		if (left == right)
			return (int) Math.pow(2, left) - 1;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}

	private static int getLeftHeight(TreeNode root) {
		if (root == null)
			return 1;
		return getLeftHeight(root.left) + 1;
	}
	private static int getRightHeight(TreeNode root) {
		if (root == null)
			return 1;
		return getRightHeight(root.right) + 1;
	}
	
	
	//某大神解
	public int countNodes_1(TreeNode root) {
        if (root == null)
            return 0;
        int count = 1;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.peek() != null) {
            TreeNode cur = queue.poll();
            if (cur.val != -105) {
                cur.val = -105;
                if (cur.left != null) {
                    queue.offer(cur.left);
                    count++;
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                    count++;
                }
            }
                
        }
        return count;
    }
	
	
}
