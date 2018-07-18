
package leetCode;

public class leetCode198 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 3, 1 };

		int x = rob(nums);

		System.out.println();
	}

	public static int rob(int[] nums) {
		int len = nums.length;
		if (len < 1) {
			return 0;
		} else if (len == 1) {
			return nums[0];
		} else if (len == 2) {
			return Math.max(nums[0], nums[1]);
		} else if (len == 3) {
			return Math.max(nums[1], nums[0] + nums[2]);
		}

		int[] temp = new int[len];
		temp[0] = nums[0];
		temp[1] = nums[1];
		temp[2] = nums[2] + nums[0];
		for (int i = 3; i < len; i++)
			temp[i] = nums[i] + Math.max(temp[i - 2], temp[i - 3]);

		return Math.max(temp[len - 1], temp[len - 2]);
	}

}
