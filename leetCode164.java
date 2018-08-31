
package leetCode;

public class leetCode164 {

	public static void main(String[] args) throws Exception {
		String version1 = "1";
		String version2 = "0";

		int x = compareVersion(version1, version2);
		System.out.println("");
	}

	//runtime 2ms
	public static int compareVersion(String version1, String version2) {
		String[] ch1 = version1.split("\\.");
		String[] ch2 = version2.split("\\.");
		int minLength = ch1.length < ch2.length ? ch1.length : ch2.length;
		for (int i = 0; i < minLength; i++) {
			int temp1 = Integer.valueOf(ch1[i]);
			int temp2 = Integer.valueOf(ch2[i]);
			if (temp1 < temp2) {
				return -1;
			} else if (temp1 > temp2)
				return 1;
		}
		if (ch1.length >= ch2.length)
			return isSameValue(ch1, ch2) ? 0 : 1;
		return isSameValue(ch2, ch1) ? 0 : -1;

	}

	private static boolean isSameValue(String[] chl, String[] chs) {
		int count = 0;
		for (int i = chs.length; i < chl.length; i++)
			count += Integer.valueOf(chl[i]);
		return count == 0;
	}

}
