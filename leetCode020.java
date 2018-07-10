
package leetCode;

import java.util.Stack;

public class leetCode020 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty())
					return false;
				switch (s.charAt(i)) {
				case ')':
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case '}':
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case ']':
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
					break;
				default:
					break;
				}

			}
		}
		return stack.isEmpty();
	}
}
