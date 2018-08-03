
package leetCode;

public class leetCode665 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 2, 4, 2, 3 };
		boolean x = checkPossibility(nums);
		System.out.println();
	}

	// runtime 21ms
	public static boolean checkPossibility(int[] nums) {
		int countDown = 0;
		int index = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				index = i + 1;
				countDown++;
			}
		}
		if (countDown > 1)
			return false;
		if (index == 0 || index == 1 || index + 1 == nums.length || nums[index - 1] <= nums[index + 1]
				|| nums[index - 2] <= nums[index])
			return true;
		return false;
	}
}
