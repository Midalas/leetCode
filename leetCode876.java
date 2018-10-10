package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode876 {
	public static void main(String[] args) {

		System.out.println();
	}

	//runtime 1ms
	public static ListNode middleNode(ListNode head) {
		ListNode quick = head;
		ListNode slow = head;
		while (quick != null && quick.next != null) {
			quick = quick.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
