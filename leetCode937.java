package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class leetCode937 {
	public static void main(String[] args) throws Exception {
		String[] logs = { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" };
		String[] x = reorderLogFiles(logs);
		System.out.println();
	}

	//runtime 10ms
	public static String[] reorderLogFiles(String[] logs) {
		String[] res = new String[logs.length];
		int i = 0;
		int j = logs.length - 1;
		for (int m = logs.length - 1; m >= 0; m--) {
			if (isNumber(logs[m])) {
				res[j--] = logs[m];
			} else {
				res[i++] = logs[m];
			}
		}
		Arrays.sort(res, 0, i, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String str1 = o1.substring(o1.indexOf(" ") + 1, o1.length());
				String str2 = o2.substring(o2.indexOf(" ") + 1, o2.length());
				// TODO Auto-generated method stub
				return str1.compareTo(str2);
			}

		});
		return res;
	}

	private static boolean isNumber(String str) {
		char c = str.charAt(str.length() - 1);
		return c >= '0' && c <= '9';
	}
}
