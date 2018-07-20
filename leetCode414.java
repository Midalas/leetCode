
package leetCode;

public class leetCode414 {

	public static void main(String[] args) throws Exception {

		int[] nums = { 5, 2, 2 };
		int x = thirdMax(nums);
		System.out.println();
	}

	// runtime 3ms
	public static int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE;
		long secend = Long.MIN_VALUE;
		long third = Long.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			long temp = nums[i];
			if (temp >= first) {
				if (temp != first) {
					third = secend;
					secend = first;
					first = temp;
				}
			} else if (temp >= secend) {
				if (temp != secend) {
					third = secend;
					secend = temp;
				}
			} else if (temp >= third) {
				third = temp;
			}
		}
		if (third == Long.MIN_VALUE)
			return (int) first;
		return (int) third;
	}
}
