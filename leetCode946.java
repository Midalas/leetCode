package leetCode;

import java.util.Stack;

public class leetCode946 {

	public static void main(String[] args) throws Exception {
		int[] pushed = { 1, 2, 3, 4, 5 };
		int[] popped = { 4, 5, 3, 2, 1 };
		boolean x = validateStackSequences(pushed, popped);
		System.out.println();
	}

	//runtime 11ms
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		int i = 0;
		int j = 0;
		Stack<Integer> stack = new Stack<Integer>();
		while (i < pushed.length) {
			if (stack.isEmpty() || stack.peek() != popped[j]) {
				stack.push(pushed[i++]);
			} else {
				stack.pop();
				j++;
			}
		}
		while (j < popped.length) {
			if (stack.peek() == popped[j]) {
				stack.pop();
				j++;
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
