package leetCode;

public class leetCode223 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	//runtime 3ms
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int area1 = (C - A) * (D - B);
		int area2 = (G - E) * (H - F);
		int area3 = 0;
		// 有重叠
		if (E > C || G < A || F > D || H < B) {
			return area1 + area2;
		} else {
			int a = Math.max(A, E);
			int b = Math.max(B, F);
			int c = Math.min(C, G);
			int d = Math.min(D, H);
			area3 = (c - a) * (d - b);
		}

		return area1 + area2 - area3;
	}
}
