package leetCode;

public class test2 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 0, 0, 0, 0, 0 };

		int[] x = threeEqualParts(nums);

		System.out.println(1);
	}

	
	//runtime 34ms
	public static int[] threeEqualParts(int[] A) {
		int headZeroIndex = 0;
		int end = A.length - 1;
		while (headZeroIndex < A.length && A[headZeroIndex] == 0) {
			headZeroIndex++;
		}
		if (headZeroIndex >= end) {
			return new int[] { 0, end };
		}

		for (int i = (A.length - 2 - headZeroIndex) / 3 + headZeroIndex; i >= headZeroIndex; i--) {
			int countL = getCountOne(A, headZeroIndex, i);
			for (int j = i + 2; j < A.length; j++) {
				int countM = getCountOne(A, i + 1, j - 1);
				if (countL == countM) {
					if (countM == getCountOne(A, j, end)) {
						if (getVal(A, headZeroIndex, i) == getVal(A, i + 1, j - 1)
								&& getVal(A, i + 1, j - 1) == getVal(A, j, end)) {
							return new int[] { i, j };
						}
					} else if (getCountOne(A, j, end) < countM) {
						break;
					} else {
						continue;
					}

				} else if (countM < countL) {
					j += countL - countM - 1;
				} else {
					break;
				}
			}
		}
		return new int[] { -1, -1 };
	}

	private static int getVal(int[] A, int start, int end) {
		int temp = 0;
		for (int i = start; i <= end; i++) {
			temp = (temp << 1) + A[i];
		}
		return temp;
	}

	private static int getCountOne(int[] A, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (A[i] == 1) {
				return end - i + 1;
			}
		}
		return 0;
	}

}
