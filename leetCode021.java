
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode021 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			ListNode result = new ListNode(-1);
			int size = 0;
			List<Integer> list = new ArrayList<Integer>();
			while (l1 != null) {
				list.add(l1.val);
				l1 = l1.next;
				size++;
			}
			while (l2 != null) {
				list.add(l2.val);
				l2 = l2.next;
				size++;
			}
			int[] array = new int[size];
			for (int i = 0; i < list.size(); i++) 
				array[i] = list.get(i);
			Arrays.sort(array);
			for (int i = 0; i < array.length; i++) 
				addNode(result, array[i]);

			return result.next;
		}

		private static void addNode(ListNode l, int val) {
			ListNode temp = l;
			while (temp.next != null) 
				temp = temp.next;
			temp.next = new ListNode(val);
		}
}
