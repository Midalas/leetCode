
package leetCode;

public class leetCode005 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String longestPalindrome(String s) {
		int max = 0;
		String maxstr = s.substring(0,1);
		String maxstr2 = s.substring(0,1);
		char[] chr = s.toCharArray();
		if(s.length()<2)
			return s;
		if(s.length()==2)
			return chr[0]==chr[1]?s:s.substring(0,1);
		for (int i = 0; i < chr.length; i++) {
			int m = i;
			int n = i;
			int p = i;
			int q = i + 1;
			while (m > 0 && n < chr.length - 1) {
				if (chr[m] == chr[n]) {
					m--;
					n++;
				} else {
					break;
				}
			}
			if (chr[m] != chr[n]) {
				m++;
				n--;
			}
			if (max < n - m) {
				max = n - m;
				maxstr = s.substring(m, n + 1);
			}

			while (p > 0 && q < chr.length - 1) {
				if (chr[p] == chr[q]) {
					p--;
					q++;
				} else {
					break;
				}
			}
			if (q < chr.length) {
				if (chr[p] != chr[q]) {
					p++;
					q--;
				}
				if (max < q - p) {
					max = q - p;
					maxstr2 = s.substring(p, q + 1);
				}
			}

		}
		return maxstr.length()<maxstr2.length()?maxstr2:maxstr;
	}
}
