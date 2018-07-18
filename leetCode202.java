
package leetCode;

import java.util.HashSet;
import java.util.Set;

public class leetCode202 {

	public static void main(String[] args) throws Exception {

		int n = 1221;

		boolean x = isHappy(n);
		System.out.println();
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (!set.contains(n)) {
			set.add(n);
			if (n == 1)
				return true;
			n = getNext(n);
		}
		return false;
	}

	private static int getNext(int n) {
		int sum = 0;
		while (n >= 10) {
			int last = n % 10;
			sum += last * last;
			n /= 10;
		}
		sum += n * n;
		return sum;
	}

}
