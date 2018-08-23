
package leetCode;

public class test2 {

	public static void main(String[] args) throws Exception {
		int[] nums={2,2,2,3};
		
		int x=singleNumber(nums);
		System.out.println("");
	}
	public static int singleNumber(int[] nums) {
		int one = 0, two = 0;
        for(int i=0;i<nums.length;i++){
        	two |= nums[i] & one;
    		one ^= nums[i];
    		int three = one & two;
    		one &= ~three;
    		two &= ~three;
        }
		return one;
    }
}
