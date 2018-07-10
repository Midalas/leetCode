
package leetCode;

public class leetCode033 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (target == nums[middle]) 
				return middle;
			if (nums[low] <= nums[middle]) {
				if (target < nums[middle] && target >= nums[low]) {
					high = middle - 1;
				} else {
					low = middle + 1;
				}
			} else {
				if (target > nums[middle] && target <= nums[high]) {
					low = middle + 1;
				} else {
					high = middle - 1;
				}
			}

		}
		return -1;
	}
}
