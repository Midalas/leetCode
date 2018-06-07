package leetCode;

public class leetCode450 {

	public static void main(String[] args) throws Exception {
		// TreeNode root = new TreeNode(5);
		// root.left = new TreeNode(3);
		// root.left.left = new TreeNode(2);
		// root.left.right = new TreeNode(4);
		// root.right = new TreeNode(6);
		// root.right.right = new TreeNode(7);
		// root=deleteNode(root, 0);

		// TreeNode root = new TreeNode(5);
		// root.left = new TreeNode(4);
		// root.right = new TreeNode(6);
		// root=deleteNode(root, 5);

		// TreeNode root = new TreeNode(2);
		// root.left = new TreeNode(1);
		// root=deleteNode(root, 2);

		TreeNode root = new TreeNode(0);
		root = deleteNode(root, 0);
		System.out.println();
	}

	public static TreeNode deleteNode(TreeNode root, int key) {
		TreeNode head = new TreeNode(Integer.MAX_VALUE);
		head.left = root;
		TreeNode temp = root;
		TreeNode pre = head;
		if (root == null)
			return null;
		while (temp != null && temp.val != key) {
			pre = pre.val < key ? pre.right : pre.left;
			temp = temp.val < key ? temp.right : temp.left;
		}
		if (temp != null && temp.val == key) {
			if (temp.right != null && temp.left != null) {
				delete(temp, temp.right);
			} else if (temp.right == null && temp.left != null) {
				if (pre.val < key) {
					pre.right = temp.left;
				} else {
					pre.left = temp.left;
				}
			} else {
				if (pre.val < key) {
					pre.right = temp.right;
				} else {
					pre.left = temp.right;
				}
			}
		}

		return head.left;
	}

	private static void delete(TreeNode pre, TreeNode root) {
		TreeNode temp = root;
		TreeNode rootp = root;
		if (temp.left == null)
			pre.right = root.right;
		while (temp.left != null) {
			rootp = temp;
			temp = temp.left;
		}
		rootp.left = temp.right;
		pre.val = temp.val;
	}
}
