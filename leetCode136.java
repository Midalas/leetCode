
package leetCode;

public class leetCode136 {

	public static void main(String[] args) throws Exception {

		
		System.out.println();
	}

	public static int singleNumber(int[] nums) {
        if(nums.length<1)
        	return nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        	res^=nums[i];
		return res;
    }
}
