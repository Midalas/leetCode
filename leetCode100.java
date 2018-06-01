package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode100 {

	public static void main(String[] args) throws Exception {
	
		System.out.println();
	}

	
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null||q==null){
				return p==null&&q==null;
		}else if(p.val==q.val){
			return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
		}else{
			return false;
		}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
