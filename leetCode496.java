
package leetCode;

public class leetCode496 {

	public static void main(String[] args) throws Exception {
		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] x = nextGreaterElement(nums1, nums2);
		System.out.println();
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int len = nums1.length;
		int[] res = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j])
					res[i] = getNextGreaterElement(nums1[i], j + 1, nums2);
			}
		}
		return res;
	}

	private static int getNextGreaterElement(int target, int j, int[] nums2) {
		for (int k = j; k < nums2.length; k++) {
			if (nums2[k] > target)
				return nums2[k];
		}
		return -1;
	}
}
