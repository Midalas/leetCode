
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode019 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		List<Integer> valist=new ArrayList<Integer>();
		ListNode result = new ListNode(0);
		ListNode temp=head;
		int length=0;
		while(temp!=null){
			valist.add(temp.val);
			temp=temp.next;
			length++;
		}
		valist.remove(length-n);
		for(int i=0;i<valist.size();i++)
			addNode(result,valist.get(i));
		return result.next;
	}
	
	
	private static void addNode(ListNode l,int val){
		ListNode temp=l;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=new ListNode(val);
	}

}
