
package leetCode;

public class leetCode227 {

	public static void main(String[] args) throws Exception {

		String s = "0-2147483647";//
		int x = calculate(s);
		System.out.println("");
	}

	// runtime 49ms
	public static int calculate(String s) {
		s = "@" + s.replace(" ", "");
		return getSumVal(s);
	}

	public static int getSumVal(String s) {
		int res = 0;
		int index = 0;
		boolean add = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				int temp = getMultVal(s.substring(index + 1, i));
				res += add ? temp : -temp;
				index = i;
				add = true;
			} else if (s.charAt(i) == '-') {
				int temp = getMultVal(s.substring(index + 1, i));
				res += add ? temp : -temp;
				index = i;
				add = false;
			}
		}
		int last = getMultVal(s.substring(index + 1, s.length()));
		return res + (add ? last : -last);
	}

	private static int getMultVal(String s) {
		int len = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '*')
				return getMultVal(s.substring(0, i)) * new Integer(s.substring(i + 1, len));
			if (s.charAt(i) == '/')
				return getMultVal(s.substring(0, i)) / new Integer(s.substring(i + 1, len));
		}
		return new Integer(s);
	}

}
