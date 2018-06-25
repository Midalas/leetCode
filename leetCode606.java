package leetCode;

public class leetCode606 {

	public static void main(String[] args) throws Exception {
//		TreeNode root=leetCode297.deserialize("1,2,3,4,#,#,#");
		TreeNode root=leetCode297.deserialize("1,2,3,#,4,#,#");		
		String s=tree2str(root);
		
		System.out.println(s);
	}

	public static String tree2str(TreeNode t) {
        if(t==null)
        	return "";  
        if(t.left==null&&t.right==null)
        	return ""+t.val;
        if(t.left!=null&&t.right==null)
        	return t.val+"("+tree2str(t.left)+")";
    	return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }

}
