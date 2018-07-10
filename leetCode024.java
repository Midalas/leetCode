
package leetCode;

public class leetCode024 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static ListNode swapPairs(ListNode head) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		int count = 0;
		int count1 = 0;
		ListNode temp = head;
		while (temp != null) {
			if (count % 2 == 0) {
				addNode(l1, temp.val);
			} else {
				addNode(l2, temp.val);
			}
			count++;
			temp = temp.next;
		}
		if(head==null||count<2)
			return head;

		ListNode l3 = new ListNode(0);
		while (count1 <=count ) {
			if (count1 % 2 != 0) {
				l1 = l1.next;
				addNode(l3, l1.val);
			} else{
				l2 = l2.next;
				if(l2!=null)
				addNode(l3, l2.val);
			}

			count1++;
		}

		head = l3.next;
		return head;
	}
    private static void addNode(ListNode l, int val) {
		ListNode temp = l;
		while (temp.next != null) 
			temp = temp.next;
		temp.next = new ListNode(val);
	}
}
