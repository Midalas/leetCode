
package leetCode;

public class leetCode633 {

	// 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
	//
	// 示例1:
	//
	// 输入: 5
	// 输出: True
	// 解释: 1 * 1 + 2 * 2 = 5
	//
	//
	// 示例2:
	//
	// 输入: 3
	// 输出: False
	// 1 4 9 16 25 36 49 64

	public static void main(String[] args) throws Exception {
		int c = 41;
		boolean x = judgeSquareSum(c);

		System.out.println();
	}

	// 10ms
	public static boolean judgeSquareSum(int c) {
		if (c == 0)
			return true;
		int i = 0;
		int j = (int) Math.sqrt(c);
		while (i <= j) {
			if (i * i + j * j == c)
				return true;
			else if (i * i + j * j > c) {
				j--;
			} else {
				i++;
			}
		}
		return false;

	}

	// runtime 33ms
	public static boolean judgeSquareSum1(int c) {
		int m = (int) Math.sqrt(c);
		for (int i = 0; i <= m; i++) {
			double temp = Math.sqrt(c - i * i);
			if (temp == (int) temp)
				return true;
		}
		return false;
	}

}
