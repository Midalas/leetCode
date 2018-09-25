package leetCode;

import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode402 {
	public static void main(String[] args) {

		String num = "1234567890";
		int k = 9;
		String x = removeKdigits(num, k);
		System.out.println();
	}

	//runtime 180ms
	public static String removeKdigits(String num, int k) {
		int len = num.length();
		if (len <= k)
			return "0";
		if (k == 0)
			return removeZero(num);
		for (int i = 0; i < len - 1; i++)
			if (num.charAt(i) > num.charAt(i + 1))
				return removeKdigits(num.substring(0, i) + num.substring(i + 1, len), k - 1);
		return removeKdigits(num.substring(0, len - 1), k - 1);
	}

	private static String removeZero(String str) {
		int len = str.length();
		if (len <= 1)
			return str;
		int index = 0;
		while (index < len - 1 && str.charAt(index) == '0')
			index++;
		return str.substring(index, str.length());

	}
}
