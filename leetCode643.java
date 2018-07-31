
package leetCode;

public class leetCode643 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 0, 4, 0, 3, 2 };
		int k = 1;
		double x = findMaxAverage(nums, k);
		System.out.println();
	}

	//runtime 16ms
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++)
			sum += nums[i];
		double max = sum;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			max = sum > max ? sum : max;
		}
		return max / k;
	}

}
