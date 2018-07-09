package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode524 {
	//"abpcplea"["ale","apple","monkey","plea"]
	public static void main(String[] args) throws Exception {
		List<String> d=new ArrayList<String>();
		d.add("ba");
		d.add("ab");
		d.add("a");
		d.add("b");
		String x = findLongestWord("bab",d);
		System.out.println();
	}

	public static String findLongestWord(String s, List<String> d) {
		if("".equals(s))
			return "";
		String result = "";
		for (String str : d) {
			if (str.length() >= result.length() && contains(s, str)){
				if(str.length() == result.length()&&result.compareTo(str)<0)
					continue;
				result = str;	
			}
		}
		return result;
	}

	private static boolean contains(String s, String s1) {
		char[] ch1 = s.toCharArray();
		char[] ch2 = s1.toCharArray();
		int i = 0;
		for (int j = 0; i < ch2.length&&j < ch1.length;) {
			if (ch2[i] == ch1[j])
				i++;
			j++;
		}
		return i==ch2.length;
	}
}
