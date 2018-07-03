package leetCode;

import java.util.Stack;

public class leetCode206 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode x = reverseList(head);
		System.out.println();

	}

	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return head;
		ListNode l1 = new ListNode(head.val);
		ListNode temp = head;
		while (temp.next != null) {
			ListNode l2 = new ListNode(temp.next.val);
			l2.next = l1;
			l1 = l2;
			temp = temp.next;
		}
		return l1;
	}

}
