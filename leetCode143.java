package leetCode;

public class leetCode143 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;

		reorderList(head);
		System.out.println();

	}

	public static void reorderList(ListNode head) {
		if(head==null)
			return;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode l2 = slow.next;
		slow.next = null;
		l2 = reverseList(l2);
		ListNode l1 = head;
		while (l2 != null) {
			ListNode next = l1.next;
			l1.next = l2;
			l2 = l2.next;
			l1 = l1.next;
			l1.next = next;
			l1 = l1.next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode tmp = head;
			head = head.next;
			tmp.next = pre;
			pre = tmp;
		}
		return pre;
	}
}
