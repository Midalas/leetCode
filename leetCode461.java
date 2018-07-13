
package leetCode;

public class leetCode461 {

	public static void main(String[] args) throws Exception {

		int x = hammingDistance(1, 4);
		System.out.println();
	}

	public static int hammingDistance(int x, int y) {
		String strx = Integer.toBinaryString(x);
		String stry = Integer.toBinaryString(y);
		int lenx = strx.length();
		int leny = stry.length();
		int maxlen = lenx > leny ? lenx : leny;
		int count = 0;
		if (lenx > leny) {
			for (int i = 0; i < lenx - leny; i++)
				stry = '0' + stry;
		} else {
			for (int i = 0; i < leny - lenx; i++)
				strx = '0' + strx;
		}

		for (int i = 0; i < maxlen; i++) {
			if (strx.charAt(i) != stry.charAt(i))
				count++;
		}
		return count;
	}
}
