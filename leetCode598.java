
package leetCode;

public class leetCode598 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	//runtime 6ms
	public int maxCount(int m, int n, int[][] ops) {
		for (int i = 0; i < ops.length; i++) {
			m = ops[i][0] < m ? ops[i][0] : m;
			n = ops[i][1] < n ? ops[i][1] : n;
		}
		return m * n;
	}

}
