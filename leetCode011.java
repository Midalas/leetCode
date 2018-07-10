
package leetCode;

public class leetCode011 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
  	public static int maxArea(int[] height) {
		  int max=0;
		  int i=0;
		  int j=height.length-1;
		  while(i<j){
			if(height[i]<height[j]){
				max=(j-i)*height[i]>max?(j-i)*height[i]:max;
				i++;
			}else{
				max=(j-i)*height[j]>max?(j-i)*height[j]:max;
				j--;
			}			
		  }
		  		  
		  return max;
	}

}
