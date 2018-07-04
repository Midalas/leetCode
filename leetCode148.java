package leetCode;

public class leetCode148 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(7);
		ListNode temp = head;
		temp.next = new ListNode(8);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = new ListNode(6);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;
		temp.next = new ListNode(7);
		temp = temp.next;
		temp.next = new ListNode(1);
		temp = temp.next;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;

		ListNode x=sortList(head);

		
		System.out.println();

	}
	//归并排序
	public static ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode quick = head;
		ListNode slow = head;
		while (quick.next != null && quick.next.next != null) {
			slow = slow.next;
			quick = quick.next.next;
		}
		ListNode l1 = slow.next;
		slow.next = null;
		return merge(sortList(head), sortList(l1));
	}

	private static ListNode merge(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(0);
		ListNode result=head;
		while(l1!=null&&l2!=null){
			if(l1.val>l2.val){
				result.next=l2;
				l2=l2.next;
			}else{
				result.next=l1;
				l1=l1.next;
			}
			result=result.next;
		}
		if(l1==null)
			result.next=l2;
		if(l2==null)
			result.next=l1;
		return head.next;
	}
}
