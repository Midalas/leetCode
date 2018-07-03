package leetCode;

import java.util.Stack;

public class leetCode234 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		boolean x = isPalindrome(head);
		System.out.println();

	}

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		Stack<Integer> stack = new Stack<Integer>();

		while (fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null && fast.next == null)
			stack.push(slow.val);
		while (slow != null && !stack.isEmpty()) {
			if (slow.val != stack.peek()) {
				return false;
			} else {
				stack.pop();
				slow = slow.next;
			}
		}
		return stack.isEmpty();
	}

}
