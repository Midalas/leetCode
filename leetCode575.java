
package leetCode;

import java.util.HashSet;
import java.util.Set;

public class leetCode575 {

	public static void main(String[] args) throws Exception {
		int[] candies={1,1,2,2,3,3,3,4,4,4,4,4,4,4,4,4};
		int x=distributeCandies(candies);
		System.out.println();
	}

	public static int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		int max = candies.length / 2;
		for (int i = 0; i < candies.length; i++) {
			if (!set.contains(candies[i])) {
				set.add(candies[i]);
				count++;
			}
			if(count > max)
				return max;
		}
		return count;
	}
}
