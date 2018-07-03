package leetCode;

import java.util.Stack;

public class test2 {


	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode x = oddEvenList(head);
		System.out.println();

	}

	public static ListNode oddEvenList(ListNode head) {
		if (head == null)
			return head;
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		int count = 1;
		while (head != null) {
			if (count % 2 == 1) {
				temp1.next = new ListNode(head.val);
				temp1 = temp1.next;
			} else {
				temp2.next = new ListNode(head.val);
				temp2 = temp2.next;
			}
			head = head.next;
			count++;
		}
		temp1.next = l2.next;
		return l1.next;
	}



}
