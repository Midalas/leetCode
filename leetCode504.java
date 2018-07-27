
package leetCode;

public class leetCode504 {

	public static void main(String[] args) throws Exception {
		int num = 9999;
		;
		String x = convertToBase7(num);
		System.out.println();
	}

	//runtime 13ms
	public static String convertToBase7(int num) {
		if (num == 0)
			return "0";
		String res = "";
		boolean flag = false;
		if (num < 0) {
			flag = true;
			num = -num;
		}
		while (num != 0) {
			res = num % 7 + res;
			num = num / 7;
		}
		return flag ? "-" + res : res;
	}
}
