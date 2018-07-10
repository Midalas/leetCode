
package leetCode;

public class leetCode035 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	   public static int searchInsert(int[] nums, int target) {
			if(nums.length==0)
				return 0;
			if(nums.length==1)
				return target<=nums[0]?0:1;
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
			return low;	
		}
	
}
