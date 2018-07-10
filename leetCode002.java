
package leetCode;

public class leetCode002 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

  	public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(-1);
		ListNode l3 = root;
		int plus = 0;
		int val = 0;
		while (!(l1 == null && l2 == null && plus == 0)) {
			if (l1 == null && l2 == null && plus == 1) {
				val = plus;
				plus=0;
			} else if (l2 == null) {
				val = l1.val+plus<10?l1.val+plus:l1.val+plus-10;
				plus= l1.val+plus<10?0:1;
			} else if (l1 == null) {
				val = l2.val+plus<10?l2.val+plus:l2.val+plus-10;
				plus= l2.val+plus<10?0:1;
			} else {
				val = l1.val + l2.val + plus < 10 ? l1.val + l2.val + plus : l1.val + l2.val + plus - 10;
				plus = l1.val + l2.val + plus < 10 ? 0 : 1;
			}

			while (l3.next != null) 
				l3 = l3.next;
			l3.next = new ListNode(val);	
			if(l1==null&&l2==null)
				break;
			if(l1!=null)
				l1 = l1.next;	
			if(l2!=null)
				l2 = l2.next;	
		}
		return root.next;
	}
}
