package leetCode;

public class leetCode025 {

	public static void main(String[] args) throws Exception {

		ListNode root = new ListNode(1);
		ListNode temp = root;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;
		// temp.next = new ListNode(6);
		// temp = temp.next;
		// temp.next = new ListNode(7);
		// temp = temp.next;
		// temp.next = new ListNode(8);
		// temp = temp.next;
		// temp.next = new ListNode(9);
		// temp = temp.next;
		// temp.next = new ListNode(10);
		temp = temp.next;

		ListNode x = reverseKGroup(root, 3);
		System.out.println();

	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode pre = null;
		ListNode result = new ListNode(0);
		int count = 0;
		while (head != null) {
			ListNode temp = head;
			head = head.next;
			temp.next = pre;
			pre = temp;
			count++;
			if (count % k == 0) {
				contact(result, pre);
				pre = null;
			}
		}
		contact(result, reverseList(pre));
		return result.next;
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

	private static void contact(ListNode l1, ListNode l2) {
		if (l1 == null){
			l1 = l2;
			return;
		}			
		ListNode temp = l1;
		while (temp.next != null)
			temp = temp.next;
		temp.next = l2;
	}

}
