package leetCode;

public class leetCode817 {

	public static void main(String[] args) throws Exception {

		ListNode root = new ListNode(3);
		ListNode temp = root;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(0);
		temp = temp.next;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(1);
		temp = temp.next;
		// temp.next = new ListNode(5);
		// temp = temp.next;
		// temp.next = new ListNode(6);
		// temp = temp.next;
		// temp.next = new ListNode(7);
		// temp = temp.next;
		// temp.next = new ListNode(8);
		// temp = temp.next;
		// temp.next = new ListNode(9);
		// temp = temp.next;
		// temp.next = new ListNode(10);
		// temp = temp.next;
		int[] G = {4 };
		int x = numComponents(root, G);
		System.out.println();

	}

	public static int numComponents(ListNode head, int[] G) {
		ListNode pre = null;
		ListNode temp = head;
		int count = 0;
		boolean flag=false;
		boolean[] exist=new boolean[10000];
		for (int i = 0; i < G.length; i++)
			exist[G[i]]=true;
		while (temp != null) {
			if (exist[temp.val]) {
				flag=true;
				pre = temp;
			} else if (pre != null&&flag) {
				count++;
				pre = null;
				flag=false;
			}
			temp = temp.next;
		}
		
		return count+(flag?1:0);
	}

}
