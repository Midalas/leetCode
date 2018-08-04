
package leetCode;

public class leetCode747 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 3, 6, 1, 0 };
		int x = dominantIndex(nums);
		System.out.println();
	}

	//runtime 21ms
	public static int dominantIndex(int[] nums) {
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		double half = max / 2.0;
		for (int i = 0; i < index; i++)
			if (nums[i] > half)
				return -1;
		for (int i = index + 1; i < nums.length; i++)
			if (nums[i] > half)
				return -1;
		return index;
	}

}
