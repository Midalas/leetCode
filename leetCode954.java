package leetCode;

public class leetCode954 {
	public static void main(String[] args) throws Exception {
		int[] A = { 2, 1, 2, 6 };
		boolean x = canReorderDoubled(A);
		System.out.println();
	}

	// runtime 40ms
	public static boolean canReorderDoubled(int[] A) {
		int size2 = 0;
		int[] num1 = new int[100000];
		int[] num2 = new int[100000];
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0) {
				num1[A[i]]++;
			} else {
				num2[-A[i]]++;
				size2++;
			}
		}
		int size1 = A.length - size2;
		for (int i = 0; i < num1.length; i++) {
			if (size1 == 0) {
				break;
			}
			if (num1[i] != 0) {
				if (num1[i + i] < num1[i]) {
					return false;
				} else {
					num1[i + i] -= num1[i];
					size1 -= num1[i] * 2;
				}
			}
		}
		for (int i = 0; i < num2.length; i++) {
			if (size2 == 0) {
				break;
			}
			if (num2[i] != 0) {
				if (num2[i + i] < num2[i]) {
					return false;
				} else {
					num2[i + i] -= num2[i];
					size2 -= num2[i] * 2;
				}
			}
		}
		return true;
	}

}
