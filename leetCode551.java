
package leetCode;

public class leetCode551 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	
	//runtime 7ms
	public static boolean checkRecord(String s) {
		char[] ch = s.toCharArray();
		int countA = 0;
		int countL = 0;
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'A':
				countA++;
				if (countA > 1)
					return false;
				countL = 0;
				break;
			case 'L':
				countL++;
				if (countL > 2)
					return false;
				break;
			default:
				countL = 0;
				break;

			}
		}
		return true;
	}
}
