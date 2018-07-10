
package leetCode;

public class leetCode034 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int[] searchRange(int[] nums, int target) {	
		int x = search(nums, target);
		if (x == -1)
			return new int[] { -1,-1 };
		int i = x;
		int j = x;
		while (i - 1 >= 0 && nums[i - 1] == target) 
			i--;
		while (j + 1 < nums.length && nums[j + 1] == target) 
			j++;
		int[] result=new int[]{i,j};
		
		return result;

	}

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (target == nums[middle]) 
				return middle;
			if (target < nums[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}
}
