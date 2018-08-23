
package leetCode;

public class leetCode152 {

	public static void main(String[] args) throws Exception {
		int[] nums = { -2,1,0,-1,-4,-4,5 };
		int x = maxProduct1(nums);
		System.out.println("");
	}

	// runtime 7ms
	public static int maxProduct(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int res = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int a = max * nums[i];
			int b = min * nums[i];
			max = Math.max(nums[i], Math.max(a, b));
			min = Math.min(nums[i], Math.min(a, b));
			res = Math.max(max, res);
		}

		return res;
	}

	// fast solve 1ms
	public static int maxProduct1(int[] nums) {
		if (nums == null)
			return 0;
		int[] max = new int[nums.length];
		int[] min = new int[nums.length];
		max[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int cur = max[i - 1] * nums[i];
			max[i] = Math.max(nums[i], Math.max(cur, min[i - 1] * nums[i]));
			min[i] = Math.min(nums[i], Math.min(cur, min[i - 1] * nums[i]));
		}
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			res = Math.max(res, max[i]);
		}
		return res;
	}

}
