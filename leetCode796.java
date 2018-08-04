
package leetCode;

public class leetCode796 {

	public static void main(String[] args) throws Exception {
		String A = "abcde";

		String B = "cdeab";

		boolean x = rotateString(A, B);

		System.out.println();
	}

	//15ms
	public static boolean rotateString(String A, String B) {
		if (A.length() != B.length())
			return false;
		int len = A.length();
		for (int i = 1; i < len; i++)
			if (A.substring(0, i).equals(B.substring(len - i, len)))
				if (A.substring(i, len).equals(B.substring(0, len-i)))
					return true;
		return len==0;
	}
	
	//fastest solve 2ms
	 public static boolean rotateString1(String A, String B) {
	       return A.length() == B.length() && (A + A).contains(B);
	 }

}
