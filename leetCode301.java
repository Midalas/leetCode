package leetCode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class leetCode301 {
	public static void main(String[] args) throws Exception {

		String s = "((a)b)c)d())))((((((((()(((((aaaaaaaaa)((";
		
		
		List<String> x=removeInvalidParentheses(s);
		System.out.println();
	}

	public static List<String> removeInvalidParentheses(String s) {
		s=simplify(s);
		List<String> res = new ArrayList<String>();
		
		return res;
	}

	private static void dfs(List<String> list, String s) {
		
	}

	private static String simplify(String s) {
		StringBuffer res = new StringBuffer();
		StringBuffer res1 = new StringBuffer();
		int len = s.length();
		int start = 0;
		// 去除第一个'('前的')'
		while (start < len) {
			char c = s.charAt(start);
			if (c == '(') {
				break;
			} else if (c != ')') {
				res.append(c);
			}
			start++;
		}
		// 去除最后一个')'后的'('
		int end = s.length() - 1;
		while (end > 0) {
			char c = s.charAt(end);
			if (c == ')') {
				res1.insert(0, c);
				break;
			} else if (c != '(') {
				res1.insert(0, c);
			}
			end--;
		}
		return res + s.substring(start, end) + res1;
	}
}
