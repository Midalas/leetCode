
package leetCode;

import java.util.Stack;

class MinStack {

	Stack<Integer> stack = new Stack<Integer>();
	int min = Integer.MAX_VALUE;

	/** initialize your data structure here. */
	public MinStack() {
		
	}

	public void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public void pop() {
		int peek = stack.pop();
		if (peek == min)
			min = stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}
