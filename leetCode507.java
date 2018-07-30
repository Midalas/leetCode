
package leetCode;

public class leetCode507 {

	public static void main(String[] args) throws Exception {

		// 输入: 28
		// 输出: True
		// 解释: 28 = 1 + 2 + 4 + 7 + 14
		int num = 111;
		boolean x = checkPerfectNumber(num);
		System.out.println();
	}

	//runtime 13ms;
	public static boolean checkPerfectNumber(int num) {
		if(num==1)
			return false;
		int sum = 0;
		int i = 2;
		int j = num / 2;
		while (i < j) {
			if (num % i == 0)
				sum += i + j;
			i++;
			j = num / i;
		}
		return sum + 1 == num;
	}
}
