
package leetCode;

public class leetCode007 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

   	public static int reverse(int x) {
		try {
			if (x < 0) {
				String str = -x + "";
				str = new StringBuilder(str).reverse().toString();
				x = -new Integer(str);
			} else {
				String str = x + "";
				str = new StringBuilder(str).reverse().toString();
				x = new Integer(str);
			}
			return x;
		} catch (Exception e) {
			return 0;
		}
	}
}
