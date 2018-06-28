package leetCode;

public class leetCode235 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("6,2,8,0,4,7,9,#,#,3,5,#,#,#,#");
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(8);

		TreeNode temp = lowestCommonAncestor(root, p, q);
		System.out.println();

	}

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        	return null;
        if(p.val<root.val&&q.val<root.val){
        	return lowestCommonAncestor(root.left,p,q);
        }else if(p.val>root.val&&q.val>root.val){
        	return lowestCommonAncestor(root.right,p,q);
        }else{
        	return root;
        }
    }


}
