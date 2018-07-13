
package leetCode;

public class leetCode852 {

	public static void main(String[] args) throws Exception {


		System.out.println();
	}

	public static int peakIndexInMountainArray(int[] A) {
        for(int i=1;i<A.length-1;i++){
        	if(A[i]>A[i-1]&&A[i]>A[i+1])
        		return i;
        }
		return -1;
    }
}
