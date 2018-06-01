package leetCode;


public class leetCode55 {

	public static void main(String[] args) throws Exception {
		 int[] nums = { 2,1,1,0,0};
//		int[] nums = { 1,1,0,1};
		boolean x = canJump(nums);
		System.out.println(x);

	}

	public static boolean canJump(int[] nums) {
		int i = 0;
		while (i < nums.length-1) {
			int max = Integer.MIN_VALUE;
			int step = 0;
			if (nums[i] == 0) {
				return false;
			}	
			for (int j = 0; j <= nums[i]; j++) {
				if (i + j >= nums.length - 1) {
					return true;
				}
				if (nums[i + j] + j >= max) {
					max = nums[i + j] + j;
					step = j;
				}
			}
			i += step;
		}
		return true;
	}

	

}
