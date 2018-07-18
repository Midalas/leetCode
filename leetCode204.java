
package leetCode;

public class leetCode204 {

	public static void main(String[] args) throws Exception {
		int n = 1500000;
		int x = countPrimes(n);
		System.out.println();
	}

	private static int countComposite = 2;
	public static int countPrimes(int n) {
		countComposite = 2;
		if (n < 3)
			return 0;
		boolean[] nums = new boolean[n];
		int temp = 2;
		int c = (int) Math.pow(n, 0.5);
		while (temp != -1) {
			if (temp > c)
				break;
			setComposite(nums, temp);
			temp = getNextPrime(nums, temp);
		}
		return n - countComposite;
	}

	private static void setComposite(boolean[] nums, int prime) {
		int n = nums.length;
		int plus = 2;
		int temp = 0;
		while (plus * prime < n) {
			temp = plus * prime;
			if (!nums[temp]) {
				nums[temp] = true;
				countComposite++;
			}
			plus++;
		}
	}

	private static int getNextPrime(boolean[] nums, int pre) {
		for (int i = pre + 1; i < nums.length; i++) {
			if (!nums[i])
				return i;
		}
		return -1;
	}
}
