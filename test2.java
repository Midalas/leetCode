package leetCode;

public class test2 {

	public static void main(String[] args) throws Exception {
		int[] A = { 3, 2, 1, 2, 1, 7 };
		int x = minIncrementForUnique(A);
		System.out.println();
	}

	public static int minIncrementForUnique(int[] A) {
		int res = 0;
		int lastIndex = 0;
		int[] count = new int[40000];
		for (int i = 0; i < A.length; i++) {
			count[A[i]]++;
		}
		for (int i = 0; i < 40000; i++) {
			while (count[i] > 1) {
				for (int j = lastIndex; j < 40000; j++) {
					if (j > i && count[j] == 0) {
						res += j - i;
						lastIndex = j + 1;
						count[i]--;
						break;
					}
				}
			}
		}
		return res;
	}

}
