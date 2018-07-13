
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode728 {

	public static void main(String[] args) throws Exception {
		int left=1;
		int right=22;
		List<Integer> x=selfDividingNumbers(left,right);
		System.out.println();
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividingNumbers(i))
				result.add(i);
		}
		return result;
	}

	private static boolean isSelfDividingNumbers(int num) {
		String str = "" + num;
		if (str.contains("0"))
			return false;
		for (int i = 0; i < str.length(); i++) {
			if (num % (str.charAt(i) - 48) != 0)
				return false;
		}
		return true;
	}
}
