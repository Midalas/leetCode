package leetCode;

public class leetCode344 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int halfLength = s.length() / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }
}
