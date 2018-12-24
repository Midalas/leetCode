package leetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class leetCode960 {

	public static void main(String[] args) throws Exception {
		String[] A = { "aabbaa", "baabab", "aaabab" };
		int x = minDeletionSize(A);
		System.out.println();
	}

	//WA
	public static int minDeletionSize(String[] A) {
		int len = A[0].length();
		char[][] ch = new char[A.length][len];
		for (int i = 0; i < A.length; i++) {
			ch[i] = A[i].toCharArray();
		}
		// 下标列表
		List<Integer> indexList = new LinkedList<Integer>();
		for (int i = 0; i < len; i++) {
			indexList.add(i);
		}
		for (int i = 0; i < A.length; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			char min = 'a';
			for (int j = 1; j < indexList.size(); j++) {
				if (ch[i][indexList.get(j - 1)] > ch[i][indexList.get(j)] ) {
					if (ch[i][indexList.get(j)] >= min) {
						stack.push(indexList.get(j - 1));
						min = ch[i][indexList.get(j-1)];
					} else {
						stack.push(indexList.get(j));
					}

				}
			}
			while (!stack.isEmpty()) {
				indexList.remove(stack.pop());
			}
		}
		return len - indexList.size();
	}
}
