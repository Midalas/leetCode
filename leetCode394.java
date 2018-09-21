package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode394 {
	public static void main(String[] args) throws Exception {
		String s = "3[a]2[bc]";
		// 返回 3[a]2[bc] "aaabcbc".
		// s = "3[a2[c]]", 返回 "accaccacc".
		// s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
		String x = decodeString(s);
		System.out.println();
	}

	//runtime 4ms
	public static String decodeString(String s) {
		char[] ch = s.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		Stack<String> stack1 = new Stack<String>();
		int temp = 0;
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == '[') {
				stack.push(temp);
				stack1.push(res);
				temp = 0;
				res = "";
			} else if (c == ']') {
				int times = stack.pop();
				String t1 = "";
				for (int j = 0; j < times; j++)
					t1 += res;
				res = stack1.pop() + t1;
			} else if (c >= '0' && c <= '9') {
				temp = 10 * temp + c - 48;
			} else {
				res += c;
			}
		}
		return res;
	}
}
