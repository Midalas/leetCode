package leetCode;

public class leetCode053 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1};
		int x=maxSubArray(nums);
		System.out.println(x);
	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = 0;
		if (nums.length < 1)
			return 0;
		if (FirstPositiveNumber(nums) <= 0) {
			return FirstPositiveNumber(nums);
		}
		for (int i = 0; i < nums.length; i++) {
			if (sum + nums[i] > 0) {
				sum += nums[i];
				max = sum > max ? sum : max;
			} else {
				sum = 0;
			}
		}
		return max;
	}
	private static int FirstPositiveNumber(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0){
				return nums[i];
			}
			max = nums[i] > max ? nums[i] : max;
		}
		return max;
	}

}
