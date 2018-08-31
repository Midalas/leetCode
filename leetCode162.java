
package leetCode;

public class leetCode162 {

	public static void main(String[] args) throws Exception {
		int[] nums={-100,9,8,3,4,5,100};
		
		
		int x=findPeakElement(nums);
		System.out.println("");
	}


	//runtime 5ms
    public static int findPeakElement(int[] nums) {
    	return findResult(nums,0,nums.length-1);
    }
    
    private static int findResult(int[] nums,int start,int end ){
    	int middle=(start+end)/2;
    	if(start>=end)
    		return start;
    	return nums[middle]<nums[middle+1]?findResult(nums,middle+1,end):findResult(nums,start,middle);

    }
}
