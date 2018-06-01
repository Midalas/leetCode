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
public class leetCode83 {

	public static void main(String[] args) throws Exception {
		// 1->2->3->3->3->4->4->5
//		ListNode head=null;
		ListNode head = new ListNode(1);
//		addNode(head, 2);
//		addNode(head, 2);
//		addNode(head, 2);
//		addNode(head, 2);
//		addNode(head, 3);
//		addNode(head, 3);
//		addNode(head, 3);
//		addNode(head, 3);
//		addNode(head, 3);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 4);
//		addNode(head, 5);
		deleteDuplicates(head);

		System.out.println();
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode l1 = head;
		while (l1!=null&&l1.next != null) {
			if(l1.val==l1.next.val){
				l1.next=l1.next.next;
			}else{
				l1=l1.next;
			}
		}
		return head;
	}

	private static void addNode(ListNode l, int val) {
		ListNode temp = l;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(val);
	}

}
