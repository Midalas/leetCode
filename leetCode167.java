
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode167 {

	public static void main(String[] args) throws Exception {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 17;
		int[] x = twoSum(numbers, target);
		System.out.println();
	}

	
	//有序
		public static int[] twoSum(int[] numbers, int target) {
			int i=0,j=numbers.length-1;
			while(i<=j){
				if(numbers[i]+numbers[j]==target){
					return new int[]{i+1,j+1};
				}else if(numbers[i]+numbers[j]>target){
					j--;
				}else{
					i++;
				}
			}
			return new int[]{0,0};
		}
	//不要求有序
	public static int[] twoSum1(int[] numbers, int target) {
		int[] nums = new int[numbers.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = target - numbers[i];
			map.put(numbers[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { i + 1, map.get(nums[i]) + 1 };
			}
		}
		return new int[] { 0, 0 };
	}
}
