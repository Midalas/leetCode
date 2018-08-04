
package leetCode;

public class leetCode717 {

	// 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
	//
	// 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
	//
	// 示例 1:
	//
	// 输入:
	// bits = [1, 0, 0]
	// 输出: True
	// 解释:
	// 唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。

	public static void main(String[] args) throws Exception {
		// 010 000
		// 110 100
		// 1110 1100
		int[] bits = { 1, 0, 1, 0 ,0,0};
		boolean x = isOneBitCharacter(bits);
		System.out.println();
	}

	//runtime 8ms
	public static boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		while (i < bits.length - 1) {
			if (bits[i] == 1)
				i++;
			i++;
		}
		return i == bits.length - 1;
	}

}
