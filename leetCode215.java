package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.jna.platform.win32.Winspool.PRINTER_INFO_4;

import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class leetCode215 {
	public static void main(String[] args) throws Exception {
		int[] nums={3,2,1,5,6,4};
		int k = 2;
		int x=findKthLargest(nums, k);
		System.out.println();
	}

	//runtime 18ms
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		for (int i = 0; i < nums.length; i++)
			queue.add(nums[i]);
		while (k-- > 1)
			queue.poll();
		return queue.poll();
	}
}
