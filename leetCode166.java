
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode166 {

	public static void main(String[] args) throws Exception {
		int numerator = -1;
		int denominator = -2147483648;
		String x = fractionToDecimal(numerator, denominator);
		System.out.println("");
	}

	// runtime 7ms
	public static String fractionToDecimal(int numerator, int denominator) {
		return fractionToDecimal2((long) numerator, (long) denominator);
	}

	private static String fractionToDecimal2(long numerator, long denominator) {
		boolean flag = false;
		if (numerator == 0)
			return "0";
		if (numerator < 0) {
			flag = !flag;
			numerator = -numerator;
		}
		if (denominator < 0) {
			flag = !flag;
			denominator = -denominator;
		}

		long leftVal = numerator / denominator;
		long rightVal = numerator % denominator;
		int count = 0;
		int end = 0;
		StringBuffer str = new StringBuffer();
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		while (true) {

			if (map.containsKey(rightVal)) {
				end = map.get(rightVal);
				break;
			} else {
				map.put(rightVal, count);
			}

			count++;

			long temp = rightVal * 10;
			if (temp > denominator) {
				int div = (int) (temp / denominator);
				rightVal = (int) (temp % denominator);
				str.append(div);
			} else {
				str.append(0);
				rightVal = rightVal * 10;
			}
			if (rightVal == 0)
				return (flag ? "-" : "") + ("0".equals(str.toString()) ? leftVal + "" : leftVal + "." + str);
			if (rightVal == numerator)
				break;
		}

		return (flag ? "-" : "") + leftVal + "." + str.substring(0, end) + "(" + str.substring(end, str.length()) + ")";
	}


}
