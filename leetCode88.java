package leetCode;

import java.util.Arrays;

public class leetCode88 {

	public static void main(String[] args) throws Exception {
		int[] nums1={2,0};
		int m=1;
		int[] nums2={1};
		int n=1;
		merge(nums1, m, nums2, n);
		System.out.println();
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=0;i<n;i++){
			nums1[m+i]=nums2[i];
		}
        Arrays.sort(nums1, 0, m+n);
    }
}
