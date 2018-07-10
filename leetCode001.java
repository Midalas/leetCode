package leetCode;

public class leetCode001 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static int[] twoSum(int[] nums, int target) {     
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target&&i!=j){     
                    int[] b=new int[2];
                    b[0]=i;
                    b[1]=j;  
                    return b;
                }
            }
        }
        return nums;
    }
}
