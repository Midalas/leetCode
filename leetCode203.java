package leetCode;

public class leetCode203 {

	public static void main(String[] args) throws Exception {

		ListNode head = new ListNode(6);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
		ListNode x=removeElements(head,6);
		System.out.println();

	}

	 public static ListNode removeElements(ListNode head, int val) {
	        if(head==null)
	        	return head;
	        if(head.val==val){
	        	return removeElements(head.next,val);
	        }else{
	        	head.next=removeElements(head.next,val);
	        	return head;
	        }
    
	 }
	
}
