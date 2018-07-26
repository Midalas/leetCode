
package leetCode;

public class leetCode453 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 3 };
		int x = minMoves(nums);
		System.out.println();
	}

	//runtime 10ms
	public static int minMoves(int[] nums) {
		int res = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++)
			min = nums[i] < min ? nums[i] : min;
		for (int i = 0; i < nums.length; i++)
			res += nums[i];
		return res - min * nums.length;
	}
}
