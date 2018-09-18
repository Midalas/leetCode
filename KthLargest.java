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
public class KthLargest {
	//runtime 132ms
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	int size = 0;
	public KthLargest(int k, int[] nums) {
		size = k;
		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
			if (queue.size() > k)
				queue.poll();
		}
	}

	public int add(int val) {
		if (queue.size() < size) {
			queue.add(val);
			return queue.peek();
		}
		if (val > queue.peek()) {
			queue.poll();
			queue.add(val);
		}
		return queue.peek();
	}
}
