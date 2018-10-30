package leetCode;

public class test2 {
	public static void main(String[] args) throws Exception {

		int[] A={4,2,5,7};
		int[] x=sortArrayByParityII(A);
		System.out.println();
	}

	//runtime 23ms
	public static int[] sortArrayByParityII(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				if (A[i] % 2 != 0) {
					int j = i + 1;
					while (j < A.length && A[j] % 2 != 0) {
						j++;
					}
					swap(A, i, j);
				}
			} else {
				if (A[i] % 2 == 0) {
					int j = i + 1;
					while (j < A.length && A[j] % 2 == 0) {
						j++;
					}
					swap(A, i, j);
				}
			}
		}
		return A;
	}

	private static void swap(int[] A, int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
}
