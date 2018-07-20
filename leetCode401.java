
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode401 {

	public static void main(String[] args) throws Exception {
		// 8 4 2 1
		// 32 16 8 4 2 1
		int num = 2;
		List<String> x = readBinaryWatch(num);
		System.out.println();
	}

	// runtime 2ms
	public static int[] time = new int[] { 8, 4, 2, 1, 32, 16, 8, 4, 2, 1 };
	public static int n = 0;

	public static List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<String>();
		boolean[] temp = new boolean[10];
		n = num;
		dfs(res, temp, 0, 0);
		return res;
	}

	private static void dfs(List<String> res, boolean[] temp, int count, int p) {
		if (count == n) {
			String str = getBinaryValue(temp);
			if (!"".equals(str))
				res.add(str);
			return;
		} else {
			while (p < 10) {
				temp[p] = true;
				dfs(res, temp, count + 1, p + 1);
				temp[p] = false;
				p++;
			}
		}
	}

	private static String getBinaryValue(boolean[] temp) {
		int h = 0;
		int m = 0;
		for (int i = 0; i < 4; i++)
			if (temp[i])
				h += time[i];
		for (int i = 4; i < 10; i++)
			if (temp[i])
				m += time[i];
		if (h > 11 || m > 59)
			return "";
		if (m < 10)
			return "" + h + ":" + "0" + m;
		return "" + h + ":" + m;

	}
}
