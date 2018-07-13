
package leetCode;

public class leetCode657 {

	public static void main(String[] args) throws Exception {

		boolean x = judgeCircle("LL");
		System.out.println();
	}

	public static boolean judgeCircle(String moves) {
		int[] temp = new int[] { 0, 0 };
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'R':
				temp[0] += 1;
				break;

			case 'L':
				temp[0] -= 1;
				break;

			case 'U':
				temp[1] += 1;
				break;

			case 'D':
				temp[1] -= 1;
				break;
			default:
				break;
			}
		}

		return temp[0] == 0 && temp[1] == 0;
	}
}
