package leetCode;

public class leetCode961 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	// runtime 9ms
	public int repeatedNTimes(int[] A) {
		boolean[] arr = new boolean[10001];
		for (int i = 0; i < A.length; i++) {
			if (arr[A[i]]) {
				return A[i];
			} else {
				arr[A[i]] = true;
			}
		}
		return -1;
	}
}
