package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode93 {

	public static void main(String[] args) throws Exception {
		String s = "0000";
		restoreIpAddresses(s);
		System.out.println();

	}

	public static List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<String>();
		dfs(result, "", s, 4);
		return result;
	}

	private static void dfs(List<String> result, String temp, String s, int n) {
		if(n==0||s.isEmpty())
			return;
		if(n==1&&s.startsWith("0")&&!s.equals("0"))
			return;
		if (n == 1&&Integer.valueOf(s) <= 255 && Integer.valueOf(s) >= 0) {
			result.add(temp.substring(1, temp.length()) + "." + s);
			return;
		}
		if (s.length() > n * 3) 
			return;
		if (s.length() >= 1)
			dfs(result, temp + "." + s.substring(0, 1), s.substring(1, s.length()), n - 1);
		if (s.length() >= 2&& Integer.valueOf(s.substring(0, 2)) >=10)
			dfs(result, temp + "." + s.substring(0, 2), s.substring(2, s.length()), n - 1);
		if (s.length() >= 3 && Integer.valueOf(s.substring(0, 3)) >=100&&Integer.valueOf(s.substring(0, 3)) <= 255)
			dfs(result, temp + "." + s.substring(0, 3), s.substring(3, s.length()), n - 1);
	}
}
