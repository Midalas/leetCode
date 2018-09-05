
package leetCode;

public class leetCode238 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1 };
		int[] x = productExceptSelf(nums);
		System.out.println("");
	}

	// runtime 4ms
	public static int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] nums1 = new int[len];
		int[] nums2 = new int[len];
		nums1[0] = 1;
		for (int i = 1; i < len; i++)
			nums1[i] = nums1[i - 1] * nums[i - 1];
		nums2[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--)
			nums2[i] = nums2[i + 1] * nums[i + 1];
		for (int i = 0; i < len; i++)
			nums[i] = nums1[i] * nums2[i];
		return nums;
	}

}
