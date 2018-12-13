package leetCode;

public class leetCode780 {
	public static void main(String[] args) throws Exception {

		boolean x = reachingPoints(1, 1, 2, 2);
		System.out.println(1);
	}

	
	//runtime 7ms
	public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
		while (tx > sx && ty > sy) {
			if (ty > tx) {
				ty %= tx;
			} else {
				tx %= ty;
			}
		}

		if (tx == sx) {
			return sy == ty || (ty - sy) % sx == 0;
		}
		if (ty == sy) {
			return sx == tx || (tx - sx) % sy == 0;
		}
		return false;
	}

}
