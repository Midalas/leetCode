
package leetCode;

import java.util.Stack;

public class leetCode682 {

	public static void main(String[] args) throws Exception {

		String[] ops={"5","-2","4","C","D","9","+","+"};
		int x=calPoints(ops);
		System.out.println();
	}

	public static int calPoints(String[] ops) {
		Stack<Integer> s = new Stack<Integer>();
		int res = 0;
		for (int i = 0; i < ops.length; i++) {
			switch (ops[i]) {
			case "+":
				int temp = s.pop();
				int sum = temp + s.peek();
				s.push(temp);
				s.push(sum);
				break;
			case "D":
				s.push(s.peek() * 2);
				break;
			case "C":
				s.pop();
				break;
			default:
				s.push(new Integer(ops[i]));
				break;
			}
		}
		while (!s.isEmpty())
			res += s.pop();
		return res;
	}
}
