package leetCode;

public class leetCode678 {
	public static void main(String[] args) throws Exception {
		String s = "())((*))";
		boolean x = checkValidString(s);
		System.out.println(x);
	}

	
	//runtime 4ms
	public static boolean checkValidString(String s) {
		char[] ch = s.toCharArray();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ')') {
				if (count1 < 1) {
					return false;
				} else {
					count1--;
				}
			} else {
				count1++;
			}
		}
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '(') {
				if (count2 < 1) {
					return false;
				} else {
					count2--;
				}
			} else {
				count2++;
			}
		}

		return true;
	}
}
