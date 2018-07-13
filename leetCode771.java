
package leetCode;

public class leetCode771 {

	public static void main(String[] args) throws Exception {

		int x = numJewelsInStones("aA","aaAaBBB");
		System.out.println();
	}

    public static int numJewelsInStones(String J, String S) {
		char[] ch = J.toCharArray();
		char[] ch1 = S.toCharArray();
		int count = 0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch1[i] == ch[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
}
