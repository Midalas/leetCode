
package leetCode;

public class leetCode027 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
   	public static int removeElement(int[] nums,int val) {
		int pos=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[pos]=nums[i];	
				pos++;
			}
		}
		return pos;		
    }
	
}
