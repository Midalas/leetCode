
package leetCode;

public class leetCode443 {

	public static void main(String[] args) throws Exception {

		char[] chars = { 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
		int x = compress(chars);
		System.out.println();
	}

	public static int compress(char[] chars) {
		int p = 0;
		int q = 0;
		while (q < chars.length) {
			int count = 0;
			char temp = chars[q];
			while (q < chars.length && chars[q] == temp) {
				q++;
				count++;
			}
			chars[p] = temp;
			if (count == 1) {
				p++;
			} else {
				char[] chcount = ("" + count).toCharArray();
				for (int i = 0; i < chcount.length; i++)
					chars[p + 1 + i] = chcount[i];
				p += (chcount.length + 1);
			}
		}
		return p;
	}

}
