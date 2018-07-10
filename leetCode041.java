
package leetCode;

public class leetCode041 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static int firstMissingPositive(int[] nums) {
		boolean[] temp=new boolean[nums.length+2];
		for(int i=0;i<nums.length;i++){
			if(nums[i]<1||nums[i]>nums.length){
				continue;
			}else{
				temp[nums[i]]=true;
			}
		}
		for(int i=1;i<temp.length;i++){
			if(!temp[i])
				return i;
		}
		return 1;
	}
}
