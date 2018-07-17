
package leetCode;

public class leetCode189 {

	public static void main(String[] args) throws Exception {

		// 输入: [1,2, 3, 4,5,6,7,8,9,10,11] 和 k = 3
		// 输出: [9,10,11,1,2,3,4,5,6,7,8]

		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
		System.out.println();
	}

	public static void rotate(int[] nums, int k) {
		if (nums.length < 1)
			return;
		int len = nums.length;
		k %= len;
		if (k < 1)
			return;
		back(nums, 0, len - 1);
		back(nums, 0, k - 1);
		back(nums, k, len - 1);
	}

	private static void back(int[] nums, int start, int end) {
		for (int i = start; i <= (start + end) / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[start + end - i];
			nums[start + end - i] = temp;
		}
	}
}
