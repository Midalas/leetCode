
package leetCode;

public class leetCode713 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3 };
		int k = 19;
		int x = numSubarrayProductLessThanK(nums, k);
		System.out.println();
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;
		int count = 0;
		int i = 0;
		long mult = 1l;
		for (int j = 0; j < nums.length; j++) {
			mult *= nums[j];
			while (mult >= k) {
				mult /= nums[i];
				i++;
			}
			count += (j - i + 1);
		}
		return count;
	}

}
