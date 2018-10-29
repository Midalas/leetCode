
package leetCode;

import java.util.Stack;

public class leetCode696 {

	public static void main(String[] args) throws Exception {
		String s = "000111";
		// 6

		int x = countBinarySubstrings(s);
		System.out.println();
	}

	// fastest solution 15ms
	public static int countBinarySubstrings(String s) {
		if (s == null || s.length() < 1) {
			return 1;
		}
		char[] charArray = s.toCharArray();
		int left = 0, right = 0, count = 0;
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] != charArray[left]) {
				if (charArray[left] == charArray[right]) {
					right = i;
				}
				if (i - right + 1 <= right - left) {
					count++;
				}
			} else if (right != 0) {
				left = right;
				right = i;
				count++;
			}
		}
		return count;
	}

	// runtime 112ms
	public static int countBinarySubstrings1(String s) {
		char[] ch = s.toCharArray();
		int res = 0;
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < ch.length;) {
			if (stack.isEmpty() || stack.peek() == ch[i]) {
				stack.push(ch[i]);
				i++;
			} else {
				while (i < ch.length && !stack.isEmpty() && stack.peek() != ch[i]) {
					stack.pop();
					count++;
					i++;
				}
				i -= count;
				res += count;
				count = 0;
				stack.clear();
			}
		}
		return res;
	}

	// over time limit
	public static int countBinarySubstrings2(String s) {
		char[] ch = s.toCharArray();
		int res = 0;
		for (int i = 0; i < ch.length; i++) {
			Stack<Character> stack = new Stack<Character>();
			int count = 0;
			for (int j = i; j < ch.length; j++) {
				if (stack.isEmpty() || stack.peek() == ch[j]) {
					stack.push(ch[j]);
					count++;
				} else {
					while (j < ch.length && !stack.isEmpty() && stack.peek() != ch[j]) {
						stack.pop();
						count--;
						j++;
					}
					break;
				}
			}
			if (stack.isEmpty() || count == 0)
				res++;

		}
		return res;
	}

}
