package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode396 {
	public static void main(String[] args) throws Exception {
		int[] A = { 4, 3, 2, 6 };
		int x = maxRotateFunction(A);
		System.out.println();
	}

	//runtime 3ms
	public static int maxRotateFunction(int[] A) {
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			temp += A[i] * i;
		}
		int max = temp;
		for (int i = 0; i < A.length; i++) {
			temp += sum - A.length * A[A.length - 1 - i];
			max = temp > max ? temp : max;
		}
		return max;
	}

}
