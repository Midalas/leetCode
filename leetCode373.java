package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class leetCode373 {
	public static void main(String[] args) throws Exception {
		int[] nums1 = { 1, 1, 2 };
		int[] nums2 = {};
		int k = 2;
		List<int[]> x = kSmallestPairs(nums1, nums2, k);
		System.out.println();
	}

	//runtime 121ms
	public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<int[]> res = new ArrayList<int[]>();
		PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				Integer val1 = o1[0] + o1[1];
				Integer val2 = o2[0] + o2[1];
				return val1.compareTo(val2);
			}
		});
		for (int i = 0; i < nums1.length; i++)
			for (int j = 0; j < nums2.length; j++)
				queue.add(new int[] { nums1[i], nums2[j] });
		while (k > 0 && !queue.isEmpty()) {
			res.add(queue.poll());
			k--;
		}
		return res;
	}
}
