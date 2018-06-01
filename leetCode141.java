package leetCode;

public class leetCode141 {

	public static void main(String[] args) throws Exception {
		int[] a={1,2};
		ListNode head=createListNode(a);
		hasCycle(head);
		System.out.println();
	}

	public static boolean hasCycle(ListNode head) {
		if(head==null||head.next==null)
			return false;
		ListNode l1 = head;
		ListNode l2 = head.next;
		while (l2 != null && l2.next != null) {
			if (l1 == l2) {
				return true;
			} else {
				l1 = l1.next;
				l2 = l2.next.next;
			}
		}
		return false;
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

}
