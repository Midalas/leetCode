
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode039 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {  
	    List<List<Integer>> res = new ArrayList<>();  
	    List<Integer> temp = new ArrayList<>();  
	    Arrays.sort(candidates);
	    dfs(res, temp, candidates, target, 0, 0);
	    return res;  
	}  
	private static void dfs(List<List<Integer>> res,List<Integer> temp,int[] candidates,int target,int sum,int level){
		//System.out.println(temp.toString());
		if(sum==target){
			res.add(new ArrayList<Integer>(temp));		
			return;
		}else if(sum>target){
			return;
		}else{
			for(int i=level;i<candidates.length;i++){
				temp.add(candidates[i]);
				dfs(res, temp, candidates, target, sum+candidates[i], i);
				temp.remove(temp.size()-1);
			}
		}
	}
}
