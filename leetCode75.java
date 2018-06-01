package leetCode;

public class leetCode75 {

	public static void main(String[] args) throws Exception {
		int nums[]={2,0,2,1,1,0};
		sortColors(nums);
		System.out.println();

	}

	 public static void sortColors(int[] nums) {
		 for(int i=0;i<nums.length-1;i++){
			 for(int j=0;j<nums.length-1;j++){
				 if(nums[j]>nums[j+1]){
					 int temp=nums[j];
					 nums[j]=nums[j+1];
					 nums[j+1]=temp;
				 }
			 }
		 } 
	}
}
