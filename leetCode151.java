
package leetCode;

public class leetCode151 {


	public static void main(String[] args) throws Exception {

		String s = "1 ";
		String x = reverseWords(s);

		System.out.println("");
	}

	//runtime 4ms
	public static String reverseWords(String s) {
		String[] array = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = array.length - 1; i >= 0; i--)
			if (!"".equals(array[i]))
				sb.append(array[i]).append(" ");
		return sb.toString().trim();
	}
}
