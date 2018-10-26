package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode816 {
	public static void main(String[] args) throws Exception {
		String S = "(0123)";
		List<String> x = ambiguousCoordinates(S);

		System.out.println();
	}

	//runtime 24ms
	public static List<String> ambiguousCoordinates(String S) {
		S = S.substring(1, S.length() - 1);
		char[] ch = S.toCharArray();
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < ch.length - 1; i++) {
			dfs(res, ch, i + 1);
		}

		return res;
	}

	private static void dfs(List<String> res, char[] ch, int index) {
		List<String> leftList = new ArrayList<String>();
		List<String> rightList = new ArrayList<String>();
		for (int i = 0; i < index; i++) {
			String temp = getString(ch, 0, index - 1, i);
			if (!"".equals(temp)) {
				leftList.add(temp);
			}
		}
		if (leftList.isEmpty())
			return;
		for (int i = index; i < ch.length; i++) {
			String temp = getString(ch, index, ch.length - 1, i);
			if (!"".equals(temp)) {
				rightList.add(temp);
			}
		}
		for (String l : leftList) {
			for (String r : rightList) {
				res.add(new StringBuffer().append("(").append(l).append(", ").append(r).append(")").toString());
			}
		}
	}

	// index表示小数点所在位置
	private static String getString(char[] ch, int start, int end, int index) {
		// 长度为1有效
		if (start == end) {
			return "" + ch[start];
		}
		// 不能以0开头
		if (ch[start] == '0' && index > start) {
			return "";
		}
		// 尾部长度为0
		if (index == end) {
			return new String(ch, start, index + 1 - start);
		}
		// 不能以0结尾
		if (ch[end] == '0') {
			return "";
		}

		return new String(ch, start, index + 1 - start) + "." + new String(ch, index + 1, end - index);
	}
}
