package leetCode;


public class leetCode86 {

	public static void main(String[] args) throws Exception {
		// 输入: head = 1->4->3->2->5->2, x = 3
		// 输出: 1->2->2->4->3->5
		int[] a = { 1, 4, 3, 2, 5, 2 };
		int x = 3;
		ListNode head = createListNode(a);
		partition(head, x);

		System.out.println();
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		while (head != null) {
			if (head.val >= x) {
				temp1.next = new ListNode(head.val);
				temp1 = temp1.next;
			} else {
				temp2.next = new ListNode(head.val);
				temp2 = temp2.next;
			}
			head = head.next;
		}
		temp2.next = l1.next;
		return l2.next;
	}

	private static ListNode createListNode(int[] a) {
		if (a.length < 1)
			return null;
		ListNode l = new ListNode(a[0]);
		ListNode temp = l;
		for (int i = 1; i < a.length; i++) {
			temp.next = new ListNode(a[i]);
			temp = temp.next;
		}
		return l;
	}

}
