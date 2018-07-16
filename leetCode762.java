
package leetCode;

public class leetCode762 {

	public static void main(String[] args) throws Exception {

		int L=248657;
		
		int R=257888;
		int x=countPrimeSetBits(L, R);
		System.out.println();
	}

	public static int countPrimeSetBits(int L, int R) {
		int count = 0;
		for (int i = L; i <= R; i++) {
			if (check(i))
				count++;
		}
		return count;
	}

	private static boolean check(int i) {
		int count = 0;
		while (i != 0) {
			if ((i & 1) == 1) 
				count++;
			i >>= 1;
		}
		if (count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 13 || count == 17|| count == 19)
			return true;
		return false;
	}
}
