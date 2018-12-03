package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetCode324 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 1, 2, 1, 2, 1 };

		wiggleSort(nums);
		System.out.println();
	}

	//runtime 34ms
	public static void wiggleSort(int[] nums) {
		int middle = (nums.length + 1) / 2;
		int small = 0;
		int large = 1;
		PriorityQueue<Integer> queueSmall = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		PriorityQueue<Integer> queueLarge = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		for (int i = 0; i < nums.length; i++) {
			queueSmall.add(nums[i]);
			if (queueSmall.size() > middle) {
				queueLarge.add(queueSmall.poll());
			}
		}

		while (!queueSmall.isEmpty()) {
			nums[small] = queueSmall.poll();
			small += 2;
		}
		while (!queueLarge.isEmpty()) {
			nums[large] = queueLarge.poll();
			large += 2;
		}
	}

}
