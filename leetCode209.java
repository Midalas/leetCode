
package leetCode;

public class leetCode209 {

	public static void main(String[] args) throws Exception {
		int s = 11;
		int[] nums = { 1, 2, 3, 4, 5 };

		int x = minSubArrayLen(s, nums);

		System.out.println();
	}


	public static int minSubArrayLen(int s, int[] nums) {
		int i = 0;
		int count = 0;
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < nums.length; j++) {
			count += nums[j];
			while (count >= s) {
				min = j - i + 1 < min ? j - i + 1 : min;
				count -= nums[i++];
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}

}
