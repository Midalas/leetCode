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
public class leetCode109 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	
	public static TreeNode sortedListToBST(ListNode head) {
		List<Integer> list=new ArrayList<Integer>();	
		while(head!=null){
			list.add(head.val);
			head=head.next;
		}
		int[] nums=new int[list.size()];
		for(int i=0;i<nums.length;i++){
			nums[i]=list.get(i);
		}
		TreeNode result=dfs(nums,0,nums.length-1);
		return result;
	}
	
	private static TreeNode dfs(int[] nums, int i, int j) {
		if (i <=j) {
			int middle = (int)Math.ceil((i + j) / 2.0);
			TreeNode node = new TreeNode(nums[middle]);
			node.left=dfs(nums,i,middle-1);
			node.right=dfs(nums,middle+1,j);
			return node;
		}else{
			return null;
		}
	}


}
