package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode350 {

	public static void main(String[] args) throws Exception {
		int[] nums1 = { 1,8, 0, 3, 0 ,0,0,0};
		int[] nums2 = { 1,0, 0 };

		int[] x = intersect(nums1, nums2);

		System.out.println();
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				list.add(nums1[i]);
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
