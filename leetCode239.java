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
public class leetCode239 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] x = maxSlidingWindow(nums, k);
		System.out.println();
	}

	//runtime 77ms
	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length < 1)
			return new int[] {};
		int[] res = new int[nums.length + 1 - k];
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		// 堆初始化
		for (int i = 0; i < k; i++)
			queue.add(nums[i]);
		for (int i = 0; i < nums.length - k; i++) {
			res[i] = queue.peek();
			queue.remove(nums[i]);
			queue.add(nums[k + i]);
		}
		res[nums.length - k] = queue.peek();
		return res;
	}
}
