package leetCode;

public class leetCode945 {

	public static void main(String[] args) throws Exception {
		int[] A = { 0, 2, 2, 2, 2 };
		int x = minIncrementForUnique(A);
		System.out.println();
	}

	// 334ms
	public static int minIncrementForUnique(int[] A) {
		int res = 0;
		int max = 0;
		int[] count = new int[80000];
		for (int i = 0; i < A.length; i++) {
			count[A[i]]++;
			max = A[i] > max ? A[i] : max;
		}

		for (int i = 0; i <= max; i++) {
			if (count[i] > 1) {
				int blankIndex = i + 1;
				while (count[i] > 1) {
					if (count[blankIndex] == 0) {
						res += blankIndex - i;
						count[blankIndex] = 1;
						count[i]--;
					}
					blankIndex++;
				}
			}
		}
		return res;
	}

	// runtime 14ms
	public int minIncrementForUnique1(int[] A) {
		int[] count = new int[100000];
		for (int x : A)
			count[x]++;

		int ans = 0, taken = 0;

		for (int x = 0; x < 100000; ++x) {
			if (count[x] >= 2) {
				taken += count[x] - 1;
				ans -= x * (count[x] - 1);
			} else if (taken > 0 && count[x] == 0) {
				taken--;
				ans += x;
			}
		}

		return ans;
	}

}
