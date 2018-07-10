
package leetCode;

import java.util.Stack;

public class leetCode032 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static int longestValidParentheses(String s) {
		int maxlength = 0;
		int i = 0;
		boolean[] array = new boolean[s.length()];
		Stack<Integer> stack = new Stack<Integer>();
		while (i < s.length()) {
			if (s.charAt(i) == '(') {
				stack.push(i);
				i++;
			} else {
				if (stack.isEmpty()) {
					i++;
				} else {
					array[stack.peek()] = true;
					array[i] = true;
					stack.pop();
					i++;
				}
			}
		}
		int temp = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j]) {
				temp++;		
			} else {
				maxlength = temp > maxlength ? temp : maxlength;
				temp = 0;
			}
		}
		maxlength = temp > maxlength ? temp : maxlength;
		return maxlength;
	}
	
}
