package leetCode;

public class leetCode81 {

	public static void main(String[] args) throws Exception {
		int[] nums= {1,3,1,1,1,1,1};
		int target=3;
		boolean x=search(nums, target);
		System.out.println(x);

	}

	public static boolean search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (target == nums[middle]) {
				return true;
			}
			if (nums[low] < nums[middle]) {
				if (target < nums[middle] && target >= nums[low]) {
					high = middle - 1;
				} else {
					low = middle + 1;
				}
			} else if(nums[low] > nums[middle]) {
				if (target > nums[middle] && target <= nums[high]) {
					low = middle + 1;
				} else {
					high = middle - 1;
				}
			}else{
				low++;
			}
		}
		return false;
	}

}
