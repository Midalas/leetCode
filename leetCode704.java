
package leetCode;

public class leetCode704 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 5 };
		int target = 5;
		int x = search(nums, target);
		System.out.println();
	}
	//runtime 3ms
	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
