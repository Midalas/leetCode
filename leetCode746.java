
package leetCode;

public class leetCode746 {

	public static void main(String[] args) throws Exception {

		int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int x=minCostClimbingStairs(cost);
		System.out.println();
	}
	
	//runtime 14ms
    public static int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++)
        	cost[i]+=cost[i-1]<cost[i-2]?cost[i-1]:cost[i-2];
    	return Math.min(cost[cost.length-2], cost[cost.length-1]);
    }
}
