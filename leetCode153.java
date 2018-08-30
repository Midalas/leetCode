
package leetCode;

public class leetCode153 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1,2,3 };

		int x = findMin(nums);
		// 输入: [3,4,5,1,2]
		// 输出: 1
		// 示例 2:
		//
		// 输入: [11,12,13,14,0,1,2,3,4,5,6,7,8,9,10]
		// 输出: 0
		System.out.println("");
	}

	
	//runtime 0ms
	public static int findMin(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		int middle = (start + end) / 2;
		if(nums[start]<nums[middle]&&nums[middle]<nums[end])
			return nums[0];
		if (start == middle)
			return nums[start] < nums[end] ? nums[start] : nums[end];
		return nums[middle] > nums[start] ? findResult(nums, middle, end) : findResult(nums, start, middle);
	}

	private static int findResult(int[] nums, int start, int end) {
		int middle = (start + end) / 2;
		if (start == middle)
			return nums[start] < nums[end] ? nums[start] : nums[end];
		return nums[middle] > nums[start] ? findResult(nums, middle, end) : findResult(nums, start, middle);
	}

}
