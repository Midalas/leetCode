package leetCode;

public class leetCode445 {

	public static void main(String[] args) throws Exception {

		ListNode l1 = new ListNode(9);
		ListNode temp = l1;
		temp.next = new ListNode(9);
		temp = temp.next;
		// temp.next = new ListNode(3);
		// temp = temp.next;
		// temp.next = new ListNode(4);
		// temp = temp.next;
		// temp.next = new ListNode(5);
		// temp = temp.next;

		ListNode l2 = new ListNode(1);
		// temp = l2;
		// temp.next = new ListNode(9);
		// temp = temp.next;
		// temp.next = new ListNode(8);
		// temp = temp.next;
		// temp.next = new ListNode(9);
		// temp = temp.next;

		ListNode x = addTwoNumbers(l1, l2);
		System.out.println();

	}
	//翻转链表相加,结果再翻转
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode temp = result;
		int plus = 0;
		ListNode p1 = reverseList(l1);
		ListNode p2 = reverseList(l2);
		while (p1 != null && p2 != null) {
			int val = p1.val + p2.val + plus;
			if (val < 10) {
				temp.next = new ListNode(val);
				plus = 0;
			} else {
				temp.next = new ListNode(val - 10);
				plus = 1;
			}
			p1 = p1.next;
			p2 = p2.next;
			temp = temp.next;
		}

		if (p1 == null) {
			while (p2 != null) {
				int temp2 = p2.val + plus;
				if (temp2 < 10) {
					temp.next = new ListNode(temp2);
					plus = 0;
					p2 = p2.next;
					temp = temp.next;
					break;
				} else {
					temp.next = new ListNode(temp2 - 10);
					p2 = p2.next;
					temp = temp.next;
					plus = 1;
				}
			}
			temp.next = p2;
		} else if (p2 == null) {
			while (p1 != null) {
				int temp1 = p1.val + plus;
				if (temp1 < 10) {
					temp.next = new ListNode(temp1);
					p1 = p1.next;
					temp = temp.next;
					plus = 0;
					break;
				} else {
					temp.next = new ListNode(temp1 - 10);
					p1 = p1.next;
					temp = temp.next;
					plus = 1;

				}
			}
			temp.next = p1;
		}
		if (plus == 1) {
			temp.next = new ListNode(1);
			temp = temp.next;
		}
		return reverseList(result.next);
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
