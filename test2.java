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
public class test2 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public int[] kthSmallestPrimeFraction(int[] A, int K) {
		int[] res = new int[2];
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				int val1 = o1[0] * o2[1];
				int val2 = o1[1] * o2[0];
				return val1 - val2;
			}
		});
		for (int i = 0; i < A.length - 1; i++) {
			
		}
		return res;
	}
}
