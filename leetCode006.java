
package leetCode;

public class leetCode006 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static  String convert(String s, int numRows) {
        if(numRows==1)
			return s;
		String str = "";
		int lines = s.length() % 2 == 0 ? s.length() / 2 : (s.length() + 1) / 2;
		char[][] chr = new char[lines][numRows];
		int k = 0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < numRows; j++) {
				if ((i % (numRows - 1) == 0 || (i + j) % (numRows - 1) == 0) && k < s.length()) {
					chr[i][j] = s.charAt(k);
					k++;
				}
			}
		}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < lines; j++) {
				if (chr[j][i] != '\0') {
					str += chr[j][i];
				}
			}
		}

		return str;

	}
}
