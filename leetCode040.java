
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetCode040 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {  
	    List<List<Integer>> res = new ArrayList<>();  
	    List<Integer> temp = new ArrayList<>();  
	    Set<String> set=new HashSet<String>();
	    Arrays.sort(candidates);
	    dfs(res, temp, set,candidates, target, 0, 0);
	    return res;  
	}  
	private static void dfs(List<List<Integer>> res,List<Integer> temp,Set<String> set,int[] candidates,int target,int sum,int level){
		if(sum==target){
			if(!set.contains(temp.toString())){
				res.add(new ArrayList<Integer>(temp));		
				set.add(temp.toString());
			}			
			return;
		}else if(sum>target){
			return;
		}else{
			for(int i=level;i<candidates.length;i++){
					temp.add(candidates[i]);
					dfs(res, temp,set,candidates, target, sum+candidates[i], i+1);
					temp.remove(temp.size()-1);
				}			
			}
		}
}
