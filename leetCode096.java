package leetCode;


public class leetCode096 {

	public static void main(String[] args) throws Exception {
		int n = 3;
		int x=numTrees(n);
		System.out.println(x);
	}

	public static int numTrees(int n) {
		int[] nums = new int[n + 1];
		nums[0] = 1;
		for (int i = 1; i <= n; i++) {
			int temp = 0;
			for (int j = 1; j <= i; j++) {
				temp += nums[j - 1] * nums[i - j];
			}
			nums[i] = temp;
		}
		return nums[n];
	}

}
