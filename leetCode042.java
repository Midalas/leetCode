
package leetCode;

public class leetCode042 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int trap(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int level = 1;
		int maxlevel = 0;
		int sum = 0;
		int count = 0;
		for (int m = 0; m < height.length; m++) 
			count += height[m];
		while (i < j) {
			while (height[i] < level && i < j) 
				i++;
			while (height[j] < level && i < j) 
				j--;
			if (i < j) {
				sum += j - i + 1;
				maxlevel = level;
			}
			level++;
		}
		if (i == j) 
			sum += j - i + height[i] - maxlevel;
		return sum - count;
	}

}
