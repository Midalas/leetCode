package leetCode;

public class leetCode147 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(-1);
		ListNode temp = head;
		temp.next = new ListNode(5);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(0);
		temp = temp.next;

		ListNode x = insertionSortList(head);
		System.out.println();

	}

	public static ListNode insertionSortList(ListNode head) {
		ListNode result = new ListNode(Integer.MIN_VALUE);
		while (head != null) {
			result = insertListNode(result, head.val);
			head = head.next;
		}
		return result.next;
	}

	private static ListNode insertListNode(ListNode head, int val) {
		ListNode l = new ListNode(val);
		if (head == null)
			return l;
		ListNode temp = head;
		while (temp != null) {
			if (temp.val <= val) {
				if (temp.next == null || temp.next.val >= val) {
					l.next = temp.next;
					temp.next = l;
					break;
				}
			} else if (temp != null) {
				l.next = temp;
				temp = l;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
}
