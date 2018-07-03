package leetCode;

public class leetCode237 {

	public static void main(String[] args) throws Exception {

		System.out.println();

	}

	public static void deleteNode(ListNode node) {
		if (node == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
