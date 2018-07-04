package leetCode;

public class leetCode160 {

	public static void main(String[] args) throws Exception {

		ListNode l = new ListNode(6);
		l.next = new ListNode(7);
		l.next.next = new ListNode(8);

		ListNode headA = new ListNode(1);
		headA.next = new ListNode(2);
		headA.next.next = l;

		ListNode headB = new ListNode(3);
		headB.next = new ListNode(4);
		headB.next.next = new ListNode(5);
		headB.next.next.next = l;

		ListNode x = getIntersectionNode(headA, headB);

		System.out.println();

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = getLengthOfListNode(headA);
		int lenB = getLengthOfListNode(headB);
		ListNode tempA = headA;
		ListNode tempB = headB;
		if (lenA > lenB) {
			while (lenA - lenB > 0) {
				tempA = tempA.next;
				lenA--;
			}
		} else {
			while (lenB - lenA > 0) {
				tempB = tempB.next;
				lenB--;
			}

		}
		while (tempA != null) {
			if (tempA == tempB)
				return tempA;
			tempA = tempA.next;
			tempB = tempB.next;
		}
		return null;
	}

	private static int getLengthOfListNode(ListNode l) {
		if (l == null)
			return 0;
		return getLengthOfListNode(l.next) + 1;
	}

}
