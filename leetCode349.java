package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode349 {

	public static void main(String[] args) throws Exception {
		int[] nums1 = { 8,0,3};
		int[] nums2 = { 0,0};

		int[] x = intersection(nums1, nums2);

		System.out.println();
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list = new ArrayList<Integer>();
		int temp =Integer.MIN_VALUE;

		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				if (nums1[i] != temp) {
					temp = nums1[i];
					list.add(temp);
				}
				i++;
				j++;
			}
		}
		int[] result = new int[list.size()];
		for (int k = 0; k < result.length; k++)
			result[k] = list.get(k);
		return result;
	}
}
