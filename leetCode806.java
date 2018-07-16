
package leetCode;

public class leetCode806 {

	public static void main(String[] args) throws Exception {
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String S = "bbbcccdddaaa";
		int[] x = numberOfLines(widths, S);
		System.out.println();
	}

	public static int[] numberOfLines(int[] widths, String S) {
		char[] ch = S.toCharArray();
		int count = 0;
		int line = 1;
		for (int i = 0; i < ch.length; i++) {
			if (widths[ch[i] - 97] + count > 100) {
				line++;
				count = widths[ch[i] - 97];
			} else {
				count += widths[ch[i] - 97];
			}
		}
		return new int[] { line, count };
	}

}
