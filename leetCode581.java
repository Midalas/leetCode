
package leetCode;

import java.util.Arrays;

public class leetCode581 {

	public static void main(String[] args) throws Exception {
		int[] nums={1};
		int x=findUnsortedSubarray(nums);
		System.out.println();
	}

	//runtime 30ms
	public static int findUnsortedSubarray(int[] nums) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < temp.length; i++)
			temp[i] = nums[i];
		Arrays.sort(temp);
		int start = 0;
		int end = temp.length - 1;
		while (start < temp.length && nums[start] == temp[start])
			start++;
		while (end > 0 && nums[end] == temp[end])
			end--;
		return start < end ? end - start + 1 : 0;
	}
}
