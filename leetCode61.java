package test;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class leetCode61 {

	public static void main(String[] args) throws Exception {
		// 输入: 1->2->3->4->5->6->NULL, k = 2
		// 输出: 5->6->1->2->3->4->NULL
		ListNode head = new ListNode(1);
		addNode(head, 2);
		addNode(head, 3);
		addNode(head, 4);
		addNode(head, 5);
		addNode(head, 6);

		int k = 6;
		ListNode l3 = rotateRight(head, k);
		System.out.println();
	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return head;
		ListNode l1 = head;
		int count = 1;
		while (l1.next != null) {
			l1 = l1.next;
			count++;
		}
		l1.next = head;
		int step = count-k%count;
		ListNode l2 = l1;
		while (step > 0) {
			l2 = l2.next;
			step--;
		}
		l1 = l2.next;
		l2.next = null;
		return l1;
	}

	private static void addNode(ListNode l, int val) {
		ListNode temp = l;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(val);
	}

}
