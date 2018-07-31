
package leetCode;

public class leetCode645 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 2, 2, 4 };
		int[] x = findErrorNums(nums);
		System.out.println();
	}

	//runtime 9ms
	public static int[] findErrorNums(int[] nums) {
		int a = 0;
		int b = 0;
		int[] copy = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			if (copy[nums[i]] == 0) {
				copy[nums[i]] = 1;
			} else {
				copy[nums[i]] = 2;
			}
		}
		for (int i = 1; i < copy.length; i++) {
			if (copy[i] != 1) {
				if (copy[i] == 2)
					a = i;
				if (copy[i] == 0)
					b = i;
			}
		}
		return new int[] { a, b };
	}
}
