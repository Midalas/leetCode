package leetCode;

@SuppressWarnings("unused")
public class leetCode82 {

	public static void main(String[] args) throws Exception {
		int[] a={1,2,3,3,3,4,5};		// 1->2->3->3->3->4->4->5
		ListNode head =createListNode(a);

		System.out.println();
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode l0 = new ListNode(0);
		l0.next = head;
		ListNode l1 = l0;
		while (l1.next != null) {
			ListNode l2 = l1.next;
			if (l2 != null && l2.next != null && l2.val == l2.next.val) {
				while (l2 != null && l2.next != null && l2.val == l2.next.val) {
					l2 = l2.next;
				}
				l1.next = l2.next;
			} else {
				l1 = l1.next;
			}
		}
		return l0.next;
	}
	
	
	
	private static ListNode createListNode(int[] a){
		if(a.length<1)
			return null;
		ListNode l=new ListNode(a[0]);
		ListNode temp=l;
		for(int i=1;i<a.length;i++){
			temp.next=new ListNode(a[i]);
			temp=temp.next;
		}
		return l;
	}
	
	
	private static void addNode(ListNode l, int val) {
		ListNode temp = l;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(val);
	}

}
