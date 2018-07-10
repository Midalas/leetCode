
package leetCode;

public class leetCode026 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int removeDuplicates(int[] nums) {
		if(nums.length<2)
			return nums.length;
		int i=1;
		int j=1;
		int temp=nums[0];
		while(i<nums.length){
			if(nums[i]==temp){
				i++;
			}else{
				temp=nums[i];
				nums[j]=temp;
				i++;
				j++;
			}
		}	
		return j;  
    }
}
