
package leetCode;

public class leetCode043 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String multiply(String num1, String num2) {
		String str = "";
		int[] arr1 = toNumArray(num1);
		int[] arr2 = toNumArray(num2);
		int attr = 0;
		int[] result = new int[num1.length() + num2.length()];
		for (int j = arr2.length - 1; j >= 0; j--) {
			for (int i = arr1.length - 1; i >= 0; i--) 
				result[i + j + 1] += arr1[i] * arr2[j];
		}
		for (int i = result.length - 1; i >= 0; i--) {
			int temp = result[i] + attr;
			if (temp >= 10) {
				result[i] = temp % 10;
				attr = temp / 10;
			} else {
				result[i] = temp;
				attr = 0;
			}
		}
        boolean flag = false;
		for (int i = 0; i < result.length; i++) {	
			if (result[i] != 0 || flag) {
				str += result[i] + "";
				flag = true;
			}
		}
		return "".equals(str)?"0":str;
	}

	private static int[] toNumArray(String str) {
		int[] result = new int[str.length()];
		for (int i = 0; i < str.length(); i++) 
			result[i] = str.charAt(i) - 48;
		return result;
	}
}
