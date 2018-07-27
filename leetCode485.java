
package leetCode;

public class leetCode485 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	//runtime 8ms
	public static int findMaxConsecutiveOnes(int[] nums) {
		int res = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {				
				res = count > res ? count : res;
				count=0;
			}
		}
		return count>res?count:res;
	}
}
