
package leetCode;

public class leetCode389 {

	public static void main(String[] args) throws Exception {
		String s = "abcde";
		String t = "abgcde";
		char x = findTheDifference(s, t);
		System.out.println();
	}

	public static char findTheDifference(String s, String t) {
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		int[] countt = new int[200];
		for (int i = 0; i < ch2.length; i++)
			countt[ch2[i]] += 1;
		for (int i = 0; i < ch1.length; i++)
			countt[ch1[i]] -= 1;
		for (int i = 97; i <= 122; i++)
			if (countt[i] > 0)
				return (char) i;
		return ' ';
	}

}
