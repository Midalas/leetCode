
package leetCode;

import java.util.Stack;

public class leetCode150 {

	public static void main(String[] args) throws Exception {

		String[] tokens = { "10" };
		int x = evalRPN(tokens);
		System.out.println("");
	}

	// runtime 26ms
	public static int evalRPN(String[] tokens) {
		Stack<String> stack = new Stack<String>();
		int result = 0;
		for (int i = tokens.length - 1; i >= 0; i--) {
			if (!stack.isEmpty() && !isOperate(stack.peek()) && !isOperate(tokens[i])) {
				while (!stack.isEmpty() && !isOperate(stack.peek())) {
					result = getResult(new Integer(stack.pop()), stack.pop(), new Integer(tokens[i]));
					tokens[i] = result + "";
				}
			}
			stack.push(tokens[i]);
		}
		return new Integer(stack.pop());
	}

	private static boolean isOperate(String str) {
		return "+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str);
	}

	private static int getResult(int i, String operate, int result) {
		switch (operate) {
		case "+":
			return result + i;
		case "-":
			return result - i;
		case "*":
			return result * i;
		case "/":
			return result / i;
		default:
			return -1;
		}
	}

	
	//fast solve 3ms
	private int N = -1;
	public int evalRPN1(String[] tokens) {
		if (N == -1)
			N = tokens.length - 1;
		String s = tokens[N--];
		char c = s.charAt(0);
		if (s.length() == 1 && "+-*/".indexOf(c) != -1) {
			int a = evalRPN(tokens);
			int b = evalRPN(tokens);
			switch (c) {
			case '+':
				return a + b;
			case '-':
				return b - a;
			case '*':
				return a * b;
			case '/':
				return b / a;
			default:
				break;
			}
		}
		return Integer.parseInt(s);
	}
}
