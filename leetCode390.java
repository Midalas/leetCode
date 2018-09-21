package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode390 {
	public static void main(String[] args) throws Exception {
		int n = 9;
		int x = lastRemaining(n);
		System.out.println();
	}

	// runtime 90ms
	public static int lastRemaining(int n) {
		if (n <= 1)
			return n;
		return 2 * (n / 2 + 1 - lastRemaining(n / 2));
	}

	// 超出时间限制
	public static int lastRemaining1(int n) {
		if (n <= 1)
			return n;
		Stack<Integer> stack1 = new Stack<Integer>();
		for (int i = 1; i <= n; i++)
			if (i % 2 == 0)
				stack1.push(i);
		return dfs(stack1);
	}

	private static int dfs(Stack<Integer> stack) {
		Stack<Integer> stack2 = new Stack<Integer>();
		int size = stack.size();
		if (size == 1)
			return stack.pop();
		for (int i = 0; i < size; i++) {
			int temp = stack.pop();
			if (i % 2 == 1)
				stack2.push(temp);
		}
		return dfs(stack2);
	}

}
