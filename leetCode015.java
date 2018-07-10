
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode015 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> backList = new ArrayList<List<Integer>>();
		Map<String,String> param=new HashMap<String,String>();
		if(null==nums||nums.length<3)
			return backList;
		if(nums[0]==nums[nums.length-1]){
			int[] nums1={nums[0],nums[0],nums[0]};
			nums=nums1;
		}
		for (int i = 1; i < nums.length-1;i++) {
			int j=0;
			int k=nums.length-1;
			while(j<i&&i<k){
				if(nums[i]+nums[j]+nums[k]>0){
					k--;
				}else if(nums[i]+nums[j]+nums[k]<0){
					j++;		
				}else{
					String str=nums[i]+""+nums[j]+""+nums[k];
					if(!param.containsKey(str)){
						param.put(str,"");	
						 List<Integer> list = new ArrayList<>(3);
						 list.add(nums[j]);
	                     list.add(nums[i]);
	                     list.add(nums[k]);
	                     backList.add(list);	                   
					}		
					j++;
	                continue;
				}
			}	
		}
		return backList;
	}

}
