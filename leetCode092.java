package leetCode;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode092 {

		public static void main(String[] args) throws Exception {
			// int[] a = {1,2,3,4,5};
			// ListNode head = createListNode(a);
			// reverseBetween(head, 2, 4);

			int[] a = { 3, 5 };
			ListNode head = createListNode(a);
			reverseBetween(head, 1, 2);

			System.out.println();
		}

		public static ListNode reverseBetween(ListNode head, int m, int n) {
			Stack<Integer> stack = new Stack<Integer>();
			int count = 0;
			ListNode l0 = new ListNode(0);
			ListNode l1 = l0;
			l1.next = head;
			while (m > 1) {
				l1 = l1.next;
				m--;
				n--;
			}
			ListNode l2 = l1.next;
			while (n > 0) {
				stack.add(l2.val);
				l2 = l2.next;
				n--;
			}
			ListNode l3 = new ListNode(0);
			ListNode temp = l3;
			while (!stack.isEmpty()) {
				temp.next = new ListNode(stack.pop());
				temp = temp.next;
			}
			temp.next = l2;
			l1.next = l3.next;
			return l0.next;
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



