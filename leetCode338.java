
package leetCode;

public class leetCode338 {

	public static void main(String[] args) throws Exception {

		int[] x = countBits(2);
		System.out.println();
	}

	//runtime 2ms
	public static int[] countBits(int num) {
		int[] res = new int[num + 1];
		int now = 1;
		int i = 1;
		while (i <= num) {
			if (i == now + now) {
				res[i] = 1;
				now += now;
			} else {
				res[i] = res[i - now] + 1;
			}
			i++;
		}
		return res;
	}
}
