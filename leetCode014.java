
package leetCode;

public class leetCode014 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static String longestCommonPrefix(String[] strs) {
		if (strs.length < 1) 
			return "";
		String matcher = strs[0];
		for (int i = 1; i < strs.length; i++) {
			String temp = "";
			for (int j = 0; j < (strs[i].length()<matcher.length()?strs[i].length():matcher.length()); j++) {
				if (strs[i].charAt(j) == matcher.charAt(j)) {
					temp += matcher.charAt(j);
				} else {
					break;
				}
			}
			if ("".equals(temp)) {
				matcher = "";
				break;
			} else {
				matcher = temp;
			}
		}
		return matcher;
	}
}
