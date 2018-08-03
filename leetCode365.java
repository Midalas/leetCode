
package leetCode;

public class leetCode365 {

	public static void main(String[] args) throws Exception {
		int x = 104693;
		int y = 104701;
		int z = 324244;

		boolean a = canMeasureWater(x, y, z);
		System.out.println();
	}
	//runtime 0ms
	public static boolean canMeasureWater(int x, int y, int z) {
		if (z == 0)
			return true;
		if (x == 0)
			return y == z;
		if (y == 0)
			return x == z;
		if ((x == y && x != z) || x + y < z)
			return false;
		return z % getMaxFun(x, y) == 0;
	}

	private static int getMaxFun(int x, int y) {
		if (x % y == 0) {
			return y;
		} else {
			return getMaxFun(y, x % y);
		}
	}

}
