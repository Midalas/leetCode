
package leetCode;

public class leetCode012 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String intToRoman(int num) {
		String result = "";
		int a1 = num / 1000;
		num = num - 1000 * a1;
		int a2 = num / 100;
		num = num - 100 * a2;
		int a3 = num / 10;
		num = num - 10 * a3;
		int a4 = num;
		while (a1 > 0) {
			result += "M";
			a1--;
		}
		if (a2 == 9) {
			result += "CM";
		} else if (a2 >= 5 && a2 <= 8) {
			result += "D";
			while (a2 > 5) {
				result += "C";
				a2--;
			}
		} else if (a2 == 4) {
			result += "CD";

		} else if (a2 >= 1 && a2 <= 3) {
			while (a2 > 0) {
				result += "C";
				a2--;
			}
		}
		if (a3 == 9) {
			result += "XC";
		} else if (a3 >= 5 && a3 <= 8) {
			result += "L";
			while (a3 > 5) {
				result += "X";
				a3--;
			}
		} else if (a3 == 4) {
			result += "XL";

		} else if (a3 >= 1 && a3 <= 3) {
			while (a3 > 0) {
				result += "X";
				a3--;
			}
		}
		if (a4 == 9) {
			result += "IX";
		} else if (a4 >= 5 && a4 <= 8) {
			result += "V";
			while (a4 > 5) {
				result += "I";
				a4--;
			}
		} else if (a4 == 4) {
			result += "IV";

		} else if (a4 >= 1 && a4 <= 3) {
			while (a4 > 0) {
				result += "I";
				a4--;
			}
		}

		return result;
	}

}
