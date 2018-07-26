
package leetCode;

import java.util.Arrays;

public class leetCode455 {

	public static void main(String[] args) throws Exception {

		int[] g = { 1, 3, 3, 4, 5 };
		int[] s = { 1, 2, 3 };
		int x = findContentChildren(g, s);
		System.out.println();
	}
	
	//runtime 18ms
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j]) {
				count++;
				i++;
			}
		}
		return count;
	}
}
