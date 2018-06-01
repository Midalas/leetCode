package test;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class leetCode66 {

	public static void main(String[] args) throws Exception {
		int[] digits = { 9,9,9,9,9,9,9 };
		plusOne(digits);
		System.out.println();
	}

	public static int[] plusOne(int[] digits) {
		if (digits[digits.length - 1] < 9) {
			digits[digits.length - 1] += 1;
		} else {
			digits[digits.length - 1] = 0;
			int upper = 1;
			for (int i = digits.length - 2; i >= 0; i--) {
				if (digits[i] + upper > 9) {
					digits[i] = 0;
					upper = 1;
				} else {
					digits[i]++;
					upper = 0;
					break;
				}
			}
			if (upper == 1) {
				int[] temp = new int[digits.length + 1];
				temp[0] = 1;
				return temp;
			}
		}
		return digits;
	}
}
