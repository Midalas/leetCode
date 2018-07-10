
package leetCode;

import java.util.Arrays;

public class leetCode031 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

   	public static void nextPermutation(int[] nums) {
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				int min = nums[i];
				int p = i;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] < min && nums[j] > nums[i - 1]) {
						min = nums[j];
						p = j;
					}
				}
				swap(nums, i - 1, p);
				break;
			}
			if (i == 1)
				Arrays.sort(nums);

		}
	}

	private static void swap(int[] nums, int p, int q) {
		int temp = nums[p];
		nums[p] = nums[q];
		nums[q] = temp;
		int[] array = new int[nums.length - p - 1];
		for (int i = 0; i < array.length; i++) 
			array[i] = nums[i + p + 1];
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) 
			nums[i + p + 1] = array[i];
	}
}
