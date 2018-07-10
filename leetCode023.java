
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode023 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> list = new ArrayList<Integer>();
		ListNode result = new ListNode(-1);
		int size = 0;
		for (int i = 0; i < lists.length; i++) {
			ListNode l1 = lists[i];
			while (l1 != null) {
				list.add(l1.val);
				l1 = l1.next;
				size++;
			}
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
