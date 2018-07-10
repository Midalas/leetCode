
package leetCode;

import java.util.Arrays;

public class leetCode016 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int distance=Integer.MAX_VALUE;
		int closest=0;
		for (int i = 1; i < nums.length-1;i++) {
			int j=0;
			int k=nums.length-1;
			while(j<i&&i<k){
				if(Math.abs(nums[i]+nums[j]+nums[k]-target)<distance){
					distance=Math.abs(nums[i]+nums[j]+nums[k]-target);
					closest=nums[i]+nums[j]+nums[k];
				}
				if(nums[i]+nums[j]+nums[k]>target){										
					k--;
				}else{							
					j++;
				}
			}		
		}
		return closest;
        
    }
}
