
package leetCode;

public class test2 {

	public static void main(String[] args) throws Exception {

		System.out.println("");
	}

	public static int[] singleNumber(int[] nums) {
		int[] res = new int[2];
		int temp=0;
		for (int i = 0; i < nums.length; i++) {
			temp^=nums[i];
		}
		return res;
	}

}
