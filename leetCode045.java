
package leetCode;

public class leetCode045 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int jump(int[] nums) {
		int count = 0;
		int i = 0;
		int maxd = 0;
		int step = 0;
		if (nums.length < 2) 
			return 0;
		while (i < nums.length) {
			for (int m = 0; m <= nums[i]; m++) {
				if (i + m >= nums.length - 1) 
					return count + 1;
				if (i + m < nums.length && m + nums[i + m] >= maxd) {
					maxd = m + nums[i + m];
					step = m;
				}
			}
			i += step;
			maxd = 0;
			if (i < nums.length) 
				count++;

		}
		return count;
	}

}
