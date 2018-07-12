
package leetCode;

public class leetCode287 {

	public static void main(String[] args) throws Exception {
		int[] nums={1,3,4,2,2};
		int x=findDuplicate(nums);
		System.out.println();
	}

	public static int findDuplicate(int[] nums) {
		for (int i = 0; i < nums.length;) {
			if (nums[i] != i) {
				if (nums[nums[i]] == nums[i])
					return nums[i];
				int temp = nums[i];
				nums[i] = nums[nums[i]];
				nums[temp] = temp;
			} else {
				i++;
			}
		}
		return -1;
	}
}
