
package leetCode;

public class leetCode476 {

	public static void main(String[] args) throws Exception {
		int num = 1;
		int x = findComplement(num);
		System.out.println();
	}

	public static int findComplement(int num) {
		String str = Integer.toBinaryString(num);
		char[] ch = str.toCharArray();
		int sum = 0;
		int temp = 1;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '0')
				sum += temp;
			temp *= 2;
		}
		return sum;
	}
}
