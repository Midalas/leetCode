
package leetCode;

public class leetCode845 {

	public static void main(String[] args) throws Exception {

		int[] A = { 1, 2, 3 };
		int x = longestMountain(A);
		System.out.println();
	}

	public static int longestMountain(int[] A) {
		int max = 0;
		for (int i = 1; i < A.length - 1;) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				int left = 0;
				int right = 0;
				while (i - left > 0 && A[i - left] > A[i - left - 1])
					left++;
				while (i + right + 1 < A.length && A[i + right] > A[i + right + 1])
					right++;
				max = left + right + 1 > max ? left + right + 1 : max;
				i += right + 1;
			} else {
				i++;
			}
		}
		return max;
	}

}
