package leetCode;

public class leetCode859 {

	public static void main(String[] args) throws Exception {

		// TreeNode root =
		// leetCode297.deserialize("6,2,8,0,4,7,9,#,#,3,5,#,#,#,#");
		String A = "aa";
		String B = "aa";
		boolean x = buddyStrings(A, B);
		System.out.println();

	}

	public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;
		Character[] array = { ' ', ' ' };
		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				count++;
				if (count > 2)
					return false;
				if (array[0] == ' ' && array[1] == ' ') {
					array[0] = A.charAt(i);
					array[1] = B.charAt(i);
				} else if (A.charAt(i) != array[1] || B.charAt(i) != array[0]) {
					return false;
				}
			}
		}
		// 字符串相同时是否存在相同字符
		if (count == 0) {
			boolean[] temp = new boolean[128];
			for (int i = 0; i < A.length(); i++) {
				if (!temp[A.charAt(i)]) {
					temp[A.charAt(i)] = true;
				} else {
					return true;
				}
			}
			return false;
		}
		return true;
	}
}
