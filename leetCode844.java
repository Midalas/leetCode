
package leetCode;

import java.util.Stack;

public class leetCode844 {

	public static void main(String[] args) throws Exception {

		boolean x=backspaceCompare("a#c","b");
		
		System.out.println();
	}

	public static boolean backspaceCompare(String S, String T) {

		return getFixedString(S).equals(getFixedString(T));
	}

	private static String getFixedString(String str) {
		if ("".equals(str))
			return "";
		Stack<Character> s = new Stack<Character>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '#') {
				if (!s.isEmpty())
					s.pop();
			} else {
				s.push(ch[i]);
			}
		}
		String res = "";
		while (!s.isEmpty())
			res += s.pop();
		return res;
	}
}
