
package leetCode;

public class leetCode441 {

	public static void main(String[] args) throws Exception {
		int n = 0;
		int x = arrangeCoins(n);
		System.out.println();
	}

	public static int arrangeCoins(int n) {
		int count = 0;
		while (n > count) {
			count++;
			n -= count;
		}
		return count;
	}
}
