
package leetCode;

public class leetCode434 {

	public static void main(String[] args) throws Exception {

		String s = "";
		int x = countSegments(s);
		System.out.println();
	}

	//runtime 2ms
	public static int countSegments(String s) {
		char[] ch = s.toCharArray();
		int res = 0;
		int head = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				if (i != head)
					res++;
				head = i + 1;
			}
		}
		return head == s.length() ? res : res + 1;
	}

}
