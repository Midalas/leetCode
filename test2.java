package leetCode;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) throws Exception {

		ListNode root = new ListNode(1);
		ListNode temp = root;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(3);
		temp = temp.next;
		// temp.next = new ListNode(4);
		// temp = temp.next;
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
		ListNode[] x = splitListToParts(root, 5);
		System.out.println();

	}

	public static ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] result = new ListNode[k];
		int length = getLengthOfListNode(root);
		int least = length / k;
		int plus = length % k;
		for (int i = 0; i < k; i++) {
			ListNode temp = root;
			int j = least + (i < plus ? 1 : 0);
			if (j < 1)
				break;
			while (j > 1) {
				temp = temp.next;
				j--;
			}
			ListNode next = temp.next;
			temp.next = null;
			result[i] = root;
			root = next;
		}
		return result;
	}

	private static int getLengthOfListNode(ListNode root) {
		if (root == null)
			return 0;
		return getLengthOfListNode(root.next) + 1;
	}

}
