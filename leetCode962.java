package leetCode;

public class leetCode962 {

	public static void main(String[] args) throws Exception {
		int[] A = { 6, 0, 8, 2, 1, 5 };
		int x = maxWidthRamp(A);
		System.out.println();
	}

	//runtime 592ms
	public static int maxWidthRamp(int[] A) {
		int res = 0;
		int lastIndex = 0;
		for (int i = 0; i < A.length - res; i++) {
			for (int j = A.length - 1; j > i + res && j >= lastIndex; j--) {
				if (A[i] <= A[j]) {
					lastIndex = lastIndex > j ? lastIndex : j;
					res = res > j - i ? res : j - i;
					break;
				}
			}
		}
		return res;
	}

}
