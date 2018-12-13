package leetCode;

public class leetCode941 {
	public static void main(String[] args) throws Exception {
		int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		boolean x = validMountainArray(A);
		System.out.println();
	}

	//runtime 8ms
	public static boolean validMountainArray(int[] A) {
		boolean flag = false;
		if (A.length < 3)
			return false;
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i - 1]) {
				return false;
			} else if (A[i] < A[i - 1]) {
				for (int j = i; j < A.length; j++) {
					if (A[j] >= A[j - 1]) {
						return false;
					}
				}
				return flag;
			} else {
				flag = true;
			}
		}
		return false;
	}

}
